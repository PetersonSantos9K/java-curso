package interfaces.ex02.solucao01;

import interfaces.ex02.solucao01.model.Contract;
import interfaces.ex02.solucao01.service.ContractService;
import interfaces.ex02.solucao01.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate localDate = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int installment = sc.nextInt();

        Contract contract = new Contract(value, localDate, number);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installment);
        sc.close();
    }
}
