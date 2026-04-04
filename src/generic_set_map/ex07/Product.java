package generic_set_map.ex07;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private final String name;
    private Double value;
    private Integer quantity;

    public Product(String name, Double value, Integer quantity){
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double valueTotal(){
        return this.value * this.quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(value, product.value) && Objects.equals(quantity, product.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, quantity);
    }


    @Override
    public int compareTo(@NotNull Product o) {
        if(name.compareTo(o.name) != 0){
            return name.compareTo(o.name);
        }

        if(quantity.compareTo(o.quantity) != 0){
            return quantity.compareTo(o.quantity);
        }

        return value.compareTo(o.value);
    }
}
