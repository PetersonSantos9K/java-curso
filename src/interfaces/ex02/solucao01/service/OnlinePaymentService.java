package interfaces.ex02.solucao01.service;

public interface OnlinePaymentService {
    Double paymentFee(final double amount);
    Double interest(final double amount, final int months);
}
