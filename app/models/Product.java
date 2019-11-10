package models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
//import org.bson.types.ObjectId;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;

import java.util.HashSet;
import java.util.Set;

@Entity("Product")
public class Product {

    @Id
    private Integer id;
    private String item;
    private Integer price;
    private String manufacturer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    private static Set<Product> products;

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

    @JsonCreator
    public Product(@JsonProperty("id") Integer id, @JsonProperty("item")  String item, @JsonProperty("price")  Integer price, @JsonProperty("manufacturer")  String manufacturer){
        this.id=id;
        this.item=item;
        this.price=price;
        this.manufacturer=manufacturer;
    }
    @JsonCreator
    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
