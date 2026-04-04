package programacao_funcional_expressao_lambda.comparator.Ex01;

import kotlin.collections.ArrayDeque;

import java.util.Comparator;
import java.util.List;

public class Program {

    void main(){

        List<Product> list = new ArrayDeque<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list){
            IO.println(p);
        }
    }
}
