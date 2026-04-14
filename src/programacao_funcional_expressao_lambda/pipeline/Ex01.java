package programacao_funcional_expressao_lambda.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {

    void main(){

        List<Integer> numbers = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = numbers.stream().map(x -> x * 10);
        IO.println(Arrays.toString(st1.toArray()));

        int sum = numbers.stream().reduce(0, Integer::sum);
        IO.println(sum);

        List<Integer> newList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        IO.println(Arrays.toString(newList.toArray()));
    }


}
