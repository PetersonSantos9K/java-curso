package interfaces.ex01.solucao01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();

        System.out.print("Data e hora de retirada (dd/MM/yyyy HH:mm): ");
        //LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
        LocalDateTime valueTest = LocalDateTime.parse("25/06/2024 13:00", dateTimeFormatter);

        System.out.print("Data e hora de retorno (dd/MM/yyyy HH:mm): ");
        //LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
        LocalDateTime valueTest2 = LocalDateTime.parse("29/06/2024 14:00", dateTimeFormatter);

        CarRental cr = new CarRental(valueTest, valueTest2, new Vehicle(model));

        System.out.println(cr);


        sc.close();
    }
}
