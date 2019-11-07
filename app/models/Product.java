package models;

import java.util.HashSet;
import java.util.Set;

public class Product {

    public Integer id;
    public String item;
    public Integer price;
    public String manufacturer;

    public Product (Integer id, String item, Integer price, String manufacturer)
    {
        this.id=id;
        this.item=item;
        this.price=price;
        this.manufacturer=manufacturer;

    }

    private static Set<Product> products;

    static {
        products = new HashSet<>();
        products.add(new Product(1,"Detergent powder", 20, "Fab"));
        products.add(new Product(2,"Choco bar", 4, "Coco Crunch"));

    }

    public static Set<Product> allProducts(){
        return products;
    }

    public static Product findById(Integer id){
        for(Product product: products){
            if(id.equals(product.id)){
                return product;
            }
        }
        return null;
    }

    public static void add(Product product){
        products.add(product);
    }
    public static boolean remove(Product product){
        return products.remove(product);
    }
}
