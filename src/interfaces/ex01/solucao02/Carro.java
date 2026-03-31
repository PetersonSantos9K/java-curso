package interfaces.ex01.solucao02;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Carro implements NotaPagamento {

    private String modelo;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Double valorPorHora;
    private Double valorDiario;
    public Carro(String modelo, LocalDateTime dataInicial, LocalDateTime dataFinal, Double valorPorHora, Double valorDiario) {
        this.modelo = modelo;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valorPorHora = valorPorHora;
        this.valorDiario = valorDiario;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getDataInicial() {
        return dataInicial;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    @Override
    public Double valorLocacao() {

        if(getDataInicial().isAfter(dataFinal)) {
            System.out.println("Data inicial não pode ser depois da data final.");
            return 0.0;
        }

        long horas = ChronoUnit.HOURS.between(dataInicial, dataFinal);
        double valorLocacao = 0.0;
        if(horas <= 12){
            return valorLocacao = horas * valorPorHora;
        }
        if(horas <= 24){
            return valorLocacao =  valorDiario;
        }

        double dias = Math.ceil((double) horas / 24);
        return valorLocacao = dias * valorDiario;
    }

    @Override
    public Double valorImposto(double valorLocacao) {

        if(valorLocacao <= 100.0){
            return valorLocacao * 0.20;
        }
        if(valorLocacao > 100.0){
            return valorLocacao * 0.15;
        }
        return 0.0;
    }

    @Override
    public Double valorTotal() {
        return valorLocacao() + valorImposto(valorLocacao());
    }
}
