package controllers;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import models.Product;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.home.welcome;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;
import xyz.morphia.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result about(String name, String lastName){
       // return ok("Hi, " +name+ " " + lastName + " Welcome to our blog");
        return ok(welcome.render(name,lastName));
    }

    public Result explore() {
       return ok(views.html.explore.render());

    }

    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
    public Result hello(String name) {
        return ok(views.html.hello.render(name));
    }

    public Result createProduct(){
        final Morphia morphia = new Morphia();
        //PackageName is the package where my Product class exists
        morphia.mapPackage("model");
        MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
        Datastore datastore = morphia.createDatastore(mongoClient, "databaseName");
        MongoClientOptions.Builder options = MongoClientOptions.builder();
        options.socketKeepAlive(true);
        //create a object
        //We can get data from client side
        // using POST/GET methods and pass them to the constructor too
       Product prod1 = new Product(1, "jelly", 3, "jerry");
        Product prod2 = new Product(2, "chocolate bar", 2, "Sneakers");
        Product prod3 = new Product(3, "cereal", 5, "Kellogs");
        List<Product> produce = new ArrayList<Product>();
        produce.add(prod1);
        produce.add(prod2);
        produce.add(prod3);
        datastore.save(produce);
        return ok(Json.toJson("Product Added"));
    }

    public Result getProduct(int id){
        final Morphia morphia = new Morphia();
        //PackageName is the package where my Product class exists
        morphia.mapPackage("model");
        MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
        Datastore datastore = morphia.createDatastore(mongoClient, "databaseName");
        MongoClientOptions.Builder options = MongoClientOptions.builder();
        options.socketKeepAlive(true);
        //We can add queried object into a new object, it'll find an object which id’s value equal to id
        Product prod = datastore.find(Product.class).field("id").equal(id).get();

        return ok(Json.toJson(prod));
    }

    public Result showProduct(){
        final Morphia morphia = new Morphia();
        //PackageName is the package where my Product class exists
        morphia.mapPackage("model");
        MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
        Datastore datastore = morphia.createDatastore(mongoClient, "databaseName");
        MongoClientOptions.Builder options = MongoClientOptions.builder();
        options.socketKeepAlive(true);
        //We can add queried object into a new object like this, it'll find an object which id’s value equal to id
        List<Product> allProduct = datastore.createQuery(Product.class).asList();
        return ok(Json.toJson(allProduct));
    }

    public int deleteProduct(int id) {

        final Morphia morphia = new Morphia();
        morphia.mapPackage("model");
        MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
        Datastore datastore = morphia.createDatastore(mongoClient, "databaseName");
        MongoClientOptions.Builder options = MongoClientOptions.builder();
        options.socketKeepAlive(true);
        Query<Product> query = datastore.createQuery(Product.class).field("id").equal("jelly");
        datastore.findAndDelete(query);
        return id;
    }


}
