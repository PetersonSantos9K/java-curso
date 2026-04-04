package generic_set_map.ex07;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    void main(){

        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 900.0, 10);
        Product p2 = new Product("Notebook", 1200.0,20);
        Product p3 = new Product("Tablet", 400.0, 30);

        stock.put(p1, p1.valueTotal());
        stock.put(p2, p1.valueTotal());
        stock.put(p3, p1.valueTotal());

        Product ps = new Product("Tv", 900.0, 10);

        IO.println("Contains 'ps' key: " + stock.containsKey(ps));

    }


    void main2(){
        Map<String, String> cookies = new TreeMap<>();


        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        IO.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        IO.println("Phone number: " + cookies.get("phone"));
        IO.println("Email: " + cookies.get("email"));
        IO.println("Size: " + cookies.size());

        IO.println("All COOKIES: ");
        for(String key : cookies.keySet()){
            IO.println(key  + ": " +cookies.get(key));
        }


    }

}
