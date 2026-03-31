package interfaces.ex01.solucao03.application;

import interfaces.ex01.solucao03.model.CarRental;
import interfaces.ex01.solucao03.model.Vehicle;
import interfaces.ex01.solucao03.service.BrazilTaxService;
import interfaces.ex01.solucao03.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Data de retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Data de retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        var cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        var rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.printf("Pagamento básico: %.2f\n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f\n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f\n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
