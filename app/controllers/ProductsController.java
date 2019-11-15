package controllers;

import models.Product;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;

import javax.inject.Inject;

import repositories.ProductRepository;
import views.html.products.*;

public class ProductsController extends Controller {


    @Inject
    private ProductRepository productt;
    @Inject
    FormFactory formFactory;

    public Result index() {

        List<Product> u = productt.showProduct();

        if (u == null) {
            return notFound("No products listed");
        }

        return ok(views.html.products.index.render(u));
    }

    //to create our products
    public Result create() {

        Form<Product> productForm = formFactory.form(Product.class);

        return ok(create.render(productForm));
    }

    //To save products
    public Result save() {

        Form<Product> productForm = formFactory.form(Product.class).bindFromRequest();
        if(productForm.hasErrors()){
            return badRequest(create.render(productForm));
        }

        Product product = productForm.get();
        Product prodCheck = productt.findById(product.getId());
        if (prodCheck!= null) {
            return notFound("Product with similar ID found, ID must be unique. Please use a different ID");
        }
        productt.save(product);

        return redirect(routes.ProductsController.index());
    }

    public Result edit(Integer id) {

        Product product = productt.findById(id);

        if (product == null) {
            return notFound("Product not found");
        }

        Form<Product> productForm = formFactory.form(Product.class).fill(product);

        return ok(edit.render(productForm));


    }

    public Result update() {

        Product product = formFactory.form(Product.class).bindFromRequest().get();
        Product oldProduct = productt.findById(product.getId());

        if (oldProduct == null) {
            return notFound("Product ID is permanent");
        }

        productt.save(product);


        return redirect(routes.ProductsController.index());
    }

    public Result destruct(Integer id) {
        Product product = productt.findById(id);
        if (product == null) {
            return notFound("No product found");
        }
        productt.delete(product);

        return redirect(routes.ProductsController.index());
    }

    //for individual product details
    public Result show(Integer id) {
        Product product = productt.findById(id);
        if (product == null) {
            return notFound("Product not found");
        }
        return ok(show.render(product));
    }


}
