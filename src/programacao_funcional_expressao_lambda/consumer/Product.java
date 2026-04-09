package programacao_funcional_expressao_lambda.consumer;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void increasePrice(double price){
        this.price += price;
    }

    public void discountPrice(double price){
        this.price -= price;
    }

    public static void staticProductConsumer(Product product){
        double priceUpdate = product.getPrice() * 0.1;
        product.increasePrice(priceUpdate);
    }

    public void noStaticProductConsumer(){
        double priceUpdate = this.getPrice() * 0.1;
        increasePrice(priceUpdate);
    }




    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
