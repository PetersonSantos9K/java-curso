package interfaces.ex06;

import interfaces.ex06.service.BrazilInterestService;
import interfaces.ex06.service.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f\n", payment);

        sc.close();
    }
}
