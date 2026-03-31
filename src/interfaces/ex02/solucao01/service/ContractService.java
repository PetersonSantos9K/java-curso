package interfaces.ex02.solucao01.service;

import interfaces.ex02.solucao01.model.Contract;
import interfaces.ex02.solucao01.model.Installment;

import java.time.LocalDate;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(final Contract contract, final int months){

        verifyContract(contract);

        var getDate = contract.getDate();

        if(months < 1){
            System.out.println("A quantidade de parcela precisa ser maior que 0.");
        }
        double valuePerInstallment = contract.getTotalValue() / months;

        for(int i=1; i <= months; i++){

            double interest = onlinePaymentService.interest(valuePerInstallment, i);
            double paymentFee = onlinePaymentService.paymentFee(valuePerInstallment + interest);

            double paymentService = valuePerInstallment + paymentFee + interest;

            var dateByParcel = LocalDate.of(getDate.getYear(), (getDate.getMonth().getValue() + i), getDate.getDayOfMonth());

            contract.getInstallments().add(new Installment(dateByParcel, paymentService));
        }

        System.out.println("Parcelas: ");
        imprimirParcelas(contract.getInstallments());
    }


    private static void verifyContract(final Contract contract){

        if(contract == null){
            System.out.println("O contrato não pode ser nulo.");
            return;
        }

        if(contract.getDate() == null){
            System.out.println("A data do contrato não pode ser nulo.");
            return;
        }

        if(contract.getTotalValue() < 1){
            System.out.println("O valor do contrato não pode ser nulo.");
            return;
        }

    }

    private static void imprimirParcelas(final List<Installment> installments){

        for(Installment i : installments){
            System.out.printf("\n%s - %.2f\n", i.getDueDate().toString(), i.getAmount());
        }
    }

}
