package programacao_funcional_expressao_lambda.consumer;
import programacao_funcional_expressao_lambda.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    void main(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Hd Case", 80.00));

        Consumer<Product> increase = x -> x.increasePrice(x.getPrice() * 0.1);
        list.forEach(x -> x.increasePrice(x.getPrice() * 0.1));
        list.forEach(System.out::println);
    }
}


