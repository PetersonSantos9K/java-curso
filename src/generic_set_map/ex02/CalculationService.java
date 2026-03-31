package generic_set_map.ex02;

import java.util.List;

public class CalculationService{

    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.getFirst();

        for(T item : list){
            if(item.compareTo(max)>0){
                max = item;
            }
        }

        return max;
    }

    public static <T> void test(){};

}
