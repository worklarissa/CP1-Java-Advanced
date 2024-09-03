package br.com.fiap.model;

public class FuncionarioJunior extends Funcionario{

    private static final double bonusPercentual = 0.20; //O acréscimo do funcionário pleno é de 10%

    public FuncionarioJunior(String nome, double horasTrabalhadas, double valorPagoHoras) {
        super(nome, horasTrabalhadas, valorPagoHoras);
    }

    @Override
    public String imprimirInformacao() {
        return "Funcionário Sênior" +
                "\nNome: " + nome +
                "\nHoras Trabalhadas: " + horasTrabalhadas +
                "\nValor pago por hora: " + valorPagoHoras +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bonus = ((int) (horasTrabalhadas / 10)) * (10 * valorPagoHoras * bonusPercentual);
        return salarioBase + bonus;
    }
}
