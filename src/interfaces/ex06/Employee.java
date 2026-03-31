package interfaces.ex06;

public class Employee {

    private Double amount;
    private Integer months;

    private Double valueTotal;


    public Employee(Double amount, Integer months, Double valueTotal) {
        this.amount = amount;
        this.months = months;
        this.valueTotal = valueTotal;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Double getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(Double valueTotal) {
        this.valueTotal = valueTotal;
    }
}
