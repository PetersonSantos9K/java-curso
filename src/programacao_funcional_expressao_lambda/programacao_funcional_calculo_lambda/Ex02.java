package programacao_funcional_expressao_lambda.programacao_funcional_calculo_lambda;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    public static int compareProducts(Product p1, Product p2){
        return p1.price().compareTo(p2.price());
    }

    void main(){
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(Ex02::compareProducts);
        list.forEach(System.out::println);
    }

}

record Product(String name, Double price){
}
