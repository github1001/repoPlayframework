package controllers;

import models.Product;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.ProductRepository;
import views.html.home.welcome;

import javax.inject.Inject;
import java.util.List;

public class HomeController extends Controller {

    @Inject
    private ProductRepository product;

    public Result index() {
        return ok(views.html.indexx.render());
    }

    public Result about(String name, String lastName) {
        return ok(welcome.render(name, lastName));
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


    public Result createProduct() {

        /*create a object
          We can get data from client side
          using POST/GET methods and pass them to the constructor too*/
        Product prod1 = new Product(1, "jelly", 3, "jerry");
        Product prod2 = new Product(2, "chocolate bar", 2, "Sneakers");
        Product prod3 = new Product(3, "cereal", 5, "Kellogs");
        Product prod4 = new Product(4, "Isotonic", 3, "Revive");
        Product prod5 = new Product(5, "coffee", 3, "Monnoko");
        Product prod6 = new Product(6, "toothpaste", 3, "Oral B");
        Product prod7 = new Product(7, "bag", 3, "giovanni");
        Product prod8 = new Product(8, "table", 3, "Ikea");
        product.save(prod1);
        product.save(prod2);
        product.save(prod3);
        product.save(prod4);
        product.save(prod5);
        product.save(prod6);
        product.save(prod7);
        product.save(prod8);

        return ok(Json.toJson("Products" +
                " Added"));
    }

    public Result getProduct(Integer id) {

        Product u = product.findById(id);

        return ok(Json.toJson(u));
    }


    public Result showProduct() {
        List<Product> u = product.showProduct();
        if (u == null) {
            return notFound("No product found");
        }

        return ok(Json.toJson(u));
    }

    public Result deleteProduct(int id) {

        Product u = product.findById(id);
        product.delete(u);

        return ok(Json.toJson("Product deleted"));
    }


}
