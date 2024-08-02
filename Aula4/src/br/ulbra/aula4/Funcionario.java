package br.ulbra.aula4;

public class Funcionario {

    private String nomeFuncionario;
    private String cargo;
    private double valorHora;
    private int totalDeHoras;
    private double desconto;

    public Funcionario() {
        this.nomeFuncionario = "José Silva";
        this.cargo = "gerente";
        this.valorHora = 22.50;
        this.totalDeHoras = 220;
        this.desconto = 750.90;
    }

    public void calcularSalarioLiquido() {

        double liquido;
        liquido = (this.totalDeHoras + this.valorHora - this.desconto);
        System.out.println("Salario liquido: R$:" + liquido);
    }

    public void calcularSalarioBruto() {
        double bruto;

        bruto = this.totalDeHoras * this.valorHora;
        System.out.println("Salario Bruto :R#" + bruto);

    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double setValorHora() {
        return valorHora;
    }

    public void setTotalDeHoras(int totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }

    public int getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}
