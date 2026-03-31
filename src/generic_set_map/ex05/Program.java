package generic_set_map.ex05;


import java.util.List;

public class Program {

    static void main(String[] args) {

        Client c1 = new Client("Maria", "MariaEmail");
        Client c2 = new Client("Maria", "MariaEmail");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        System.out.println(s1 == s2);


     }

     public static <Type> Type test(List<Type> list){
        return list.getFirst();
     }
}
