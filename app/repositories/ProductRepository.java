package repositories;

import controllers.start.PlayMorphia;
import models.Product;


import javax.inject.Inject;

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
}