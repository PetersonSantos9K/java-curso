package programacao_funcional_expressao_lambda.programacao_funcional_calculo_lambda;

import java.util.Arrays;

public class Ex01 {
    private static final Integer globalValue = 3;
    void main(){
        int[] vect = new int[]{3,4,5};
        changeOddValues(vect);
        IO.println(Arrays.toString(vect));
    }

    private static void changeOddValues(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }

        }
    }

}
