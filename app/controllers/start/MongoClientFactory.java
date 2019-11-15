package controllers.start;

import com.typesafe.config.Config;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import play.Logger;
import javax.inject.Inject;

public class MongoClientFactory {

    protected Config config;
    protected boolean isTest;
    final Logger.ALogger log = Logger.of(this.getClass());

    public MongoClientFactory(Config config) {
        this.config = config;
    }

    @Inject
    protected MongoClientFactory(Config config, boolean isTest) {
        this.config = config;
        this.isTest = isTest;
    }

    /**
     * Creates and returns a new instance of a MongoClient.
     *
     * @return a new MongoClient
     * @throws Exception
     */
    public MongoClient createClient() throws Exception {
        MongoClientURI uri = getClientURI();
        MongoClient mongo = new MongoClient(uri.getDatabase());

        return mongo;
    }

    /**
     * Returns the database name associated with the current configuration.
     *
     * @return The database name
     */
    public String getDBName() {
        return getClientURI().getDatabase();
    }

    protected MongoClientURI getClientURI() {
        MongoClientURI uri = new MongoClientURI(
                isTest
                        ? config.getString("db.test-uri")
                        : config.getString("db.uri"));
        return uri;
    }

    /**
     * Returns the models folder name associated with the current configuration.
     *
     * @return The models folder name
     */
    public String getModels() {
        return config.getString("db.models");
    }

}