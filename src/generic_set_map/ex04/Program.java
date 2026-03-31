package generic_set_map.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    static void main(String[] args) {


        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDouble = Arrays.asList(3.14, 6.18);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts, myObjects);
        copy(myDouble, myObjects);

        printList(myObjects);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        destiny.addAll(source);
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }


}

class Program2{

    static void main2(String[] args) {
        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        double totalAreaCircles = totalArea(myCircles);

        System.out.println(totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list){

        double value = 0.0;

        for(Shape s : list){
            value += s.area();
        }

        return value;
    }
}
