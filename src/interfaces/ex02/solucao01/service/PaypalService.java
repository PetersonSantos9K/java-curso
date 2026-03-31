package interfaces.ex02.solucao01.service;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(final double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(final double amount, final int months) {
        return (amount * 0.01) * months;
    }
}
