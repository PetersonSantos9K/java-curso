package programacao_funcional_expressao_lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex01 {

    void main(){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Hd Case", 80.00));

        Predicate<Product> pred = x -> x.getPrice() >= 100.00;
        list.removeIf(pred);
        list.forEach(System.out::println);

    }
}


