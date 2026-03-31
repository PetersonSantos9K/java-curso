package interfaces.ex01.solucao03.service;

public class BrazilTaxService implements TaxService {

    public double tax(final double amount) {
        if(amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }

}
