package programacao_funcional_expressao_lambda.funcaoRecebeFuncao;

import programacao_funcional_expressao_lambda.funcaoRecebeFuncao.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex01 {


    void main(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double price = filteredSum(list, x -> x.getName().charAt(0) == 'T');
        IO.println(price);
    }

    private double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product prod : list){
            if(criteria.test(prod)){
                sum += prod.getPrice();
            }
        }

        return sum;
    };

}
