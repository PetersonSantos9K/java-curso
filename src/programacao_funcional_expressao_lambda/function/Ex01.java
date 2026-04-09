package programacao_funcional_expressao_lambda.function;

import programacao_funcional_expressao_lambda.function.util.FunctionProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ex01 {
    void main() {

        List<Product> list =  new ArrayList<>();


        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> function = x -> x.getName().toUpperCase();
        List<String> names = list.stream().map(x -> x.getName().toUpperCase()).toList();
        names.forEach(System.out::println);
    }
}
