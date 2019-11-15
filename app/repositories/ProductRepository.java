package repositories;

import controllers.start.PlayMorphia;
import models.Product;

import javax.inject.Inject;
import java.util.List;

public class ProductRepository {

    private final PlayMorphia morphia;

    @Inject
    public ProductRepository(PlayMorphia morphia) {
        this.morphia = morphia;
    }

    public Product findById(Integer id) {
        Product prod = morphia.
                datastore().
                find(Product.class).
                field("id").
                equal(id).
                get();
        return prod;
    }

    public void save(Product u) {
        morphia.datastore().save(u);
    }

    public List<Product> showProduct() {

        List<Product> allProduct = morphia.datastore().createQuery(Product.class).asList();

        return allProduct;
    }

    public void delete(Product u) {

        morphia.datastore().delete(u);

    }
}
