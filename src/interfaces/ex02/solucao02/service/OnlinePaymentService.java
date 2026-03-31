package interfaces.ex02.solucao02.service;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);

}
