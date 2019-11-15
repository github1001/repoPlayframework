package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import play.data.validation.Constraints;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;

import java.util.List;

@Entity("Product")
public class Product {

    @Id
    public Integer id;
    @Constraints.Required
    public String item;
    @Constraints.Required
    public Integer price;
    @Constraints.Required
    public String manufacturer;

    public Integer getId() { return id; }

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

    @JsonCreator
    public Product(@JsonProperty("id") Integer id, @JsonProperty("item") String item, @JsonProperty("price") Integer price, @JsonProperty("manufacturer") String manufacturer) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @JsonCreator
    public Product() {
    }

    private static List<Product> productss;

    public static List<Product> getProductss() {
        return productss;
    }

    public static void setProductss(List<Product> productss) {
        Product.productss = productss;
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
