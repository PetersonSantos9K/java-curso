package generic_set_map.ex06;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(@NotNull Produto o) {
        String formatName = name.toLowerCase();
        String formatNameOtherObject = o.name.toLowerCase();
        if(formatName.compareTo(formatNameOtherObject) !=0){
            return formatName.compareTo(formatNameOtherObject) ;
        }

        if(this.price.compareTo(o.price) != 0.0){
            this.price.compareTo(o.price);
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
