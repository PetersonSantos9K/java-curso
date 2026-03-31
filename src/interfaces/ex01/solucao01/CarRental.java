package interfaces.ex01.solucao01;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CarRental implements Invoice{

    private LocalDateTime dateInitial;
    private LocalDateTime dateFinal;
    private Vehicle vehicle;

    private Integer valuePerHour = 10;
    private Integer valuePerDay = 130;


    public CarRental() {}

    public CarRental(LocalDateTime dateInitial, LocalDateTime dateFinal, Vehicle vehicle) {
        this.dateInitial = dateInitial;
        this.dateFinal = dateFinal;
        this.vehicle = vehicle;
    }


    @Override
    public Double basicPayment() {

        if(dateInitial.isAfter(dateFinal)){
            System.out.println("Data inicial deve ser anterior a data final");
            return 0.0;
        }

        long hours = ChronoUnit.HOURS.between(dateInitial, dateFinal);
        long minutes = ChronoUnit.MINUTES.between(dateInitial, dateFinal);
        double ceiledHours = (hours * 60) % minutes;
        if(hours > 12){

            double days = Math.ceil(hours / 24.0);
            return days * valuePerDay;
        }


        return ceiledHours > 0 ? Math.ceil((hours+1)*valuePerHour) : Math.ceil(hours * valuePerHour);
    }

    @Override
    public Double tax() {

        if(basicPayment() == 0.0){
            System.out.println("Não é possível calcular o imposto, pois o pagamento básico é zero.");
            return 0.0;
        }
        if(basicPayment() <= 100.0){
            return basicPayment() * 0.2;
        }
        return basicPayment() * 0.15;
    }

    @Override
    public Double totalPayment() {

        return basicPayment() + tax();
    }

    @Override
    public String toString() {
        return String.format("Basic payment: %.2f\nTax: %.2f\nTotal payment: %.2f\n", basicPayment(), tax(), totalPayment());
    }
}
