package generic_set_map.ex01;

import java.util.Scanner;

public class Program {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object o = 20;
        int x = (int) o;

        PrintService<String> ps = new PrintService();

        System.out.println("How many values: ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("\nFirst: " + ps.first());

        sc.close();


    }
}
