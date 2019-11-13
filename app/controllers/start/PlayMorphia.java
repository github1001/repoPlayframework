package controllers.start;

import com.mongodb.MongoClient;
import com.typesafe.config.Config;
import play.Environment;
import play.inject.ApplicationLifecycle;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.lang.reflect.Constructor;
import java.util.concurrent.CompletableFuture;


@Singleton
public class PlayMorphia {

    MongoClient mongo = null;
    Datastore datastore = null;
    Morphia morphia = null;

    @Inject
    public PlayMorphia(ApplicationLifecycle lifecycle, Environment env, Config config) {
        try {
            configure(config, env.classLoader(), env.isTest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        lifecycle.addStopHook(()->{
            if (env.isTest()) {
                mongo().close();
            }
            return CompletableFuture.completedFuture(null);
        });
    }


    PlayMorphia(Config config, ClassLoader classLoader, boolean isTestMode) throws Exception {
        configure(config,classLoader,isTestMode);
    }


    private void configure(Config config, ClassLoader classLoader, boolean isTestMode) throws Exception {

        String clientFactoryName = config.getString("db.mongoClientFactory");
        MongoClientFactory factory = getMongoClientFactory(clientFactoryName, config, isTestMode);
        mongo = factory.createClient();

        if (mongo == null) {
            throw new IllegalStateException("Mongoclient not created for the instance : "+ factory.getClass().getName());
        }

        morphia = new Morphia();

        // Tell Morphia where to find our models
        morphia.mapPackage(factory.getModels());

        datastore = morphia.createDatastore(
                mongo, factory.getDBName());

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected MongoClientFactory getMongoClientFactory(String className, Config config, boolean isTestMode) throws Exception {

        if (className != null) {
            try {
                Class factoryClass = Class.forName(className, true, Thread.currentThread().getContextClassLoader());
                if (!MongoClientFactory.class.isAssignableFrom(factoryClass)) {
                    throw new IllegalStateException("MongoClientFactory '" + className +
                            "' is not of type " + MongoClientFactory.class.getName());
                }

                Constructor constructor = null;
                try {
                    constructor = factoryClass.getConstructor(Config.class);
                } catch (Exception e) {
                    //Exception note
                }
                if (constructor == null) {
                    return (MongoClientFactory) factoryClass.newInstance();
                }
                return (MongoClientFactory) constructor.newInstance(config);
            } catch (ClassNotFoundException e) {
                throw e;
            }
        }
        return new MongoClientFactory(config, isTestMode);
    }


    public MongoClient mongo() {
        return mongo;
    }
    public Datastore datastore() { return datastore; }
    public Morphia morphia() { return morphia; }
}