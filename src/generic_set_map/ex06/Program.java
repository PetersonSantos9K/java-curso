package generic_set_map.ex06;
import java.util.*;

public class Program {

    void main(){

        Set<Produto> products = new TreeSet<>();



        products.add(new Produto("TV", 900.0));
        products.add(new Produto("Bola", 50.0));
        products.add(new Produto("Notebook", 1200.0));
        products.add(new Produto("Antena", 200.0));
        products.add(new Produto("Tablet", 400.0));

        for(Produto prod : products){
            System.out.println(prod);
        }

    }

    void main2(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Tablet");
        set.add("TV");
        set.add("Notebook");

        //set.remove("Tablet");
        //IO.println(set.contains("Notebook"));

        //set.removeIf(element -> element.charAt(0) == 'T');


        for(String p : set){
            System.out.println(p);
        }

    }

    void main3(){
        Set<Integer> a,b;
        a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // Union
        // C vai ser uma copia de a
        // vamos ter o conjunto c que copia o a seguir faz a união com o conjunto b
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        IO.println(c);

        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        IO.println(d);

        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        IO.println(e);

    }

    void main4(){
        Set<Produto> products = new TreeSet<>();

        products.add(new Produto("TV", 900.0));
        products.add(new Produto("Notebook", 1200.0));
        products.add(new Produto("Tablet", 400.0));

        Produto prod = new Produto("Notebook", 1500.0);

        System.out.println(products.toString());


    }


}


