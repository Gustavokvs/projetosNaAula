package br.ulbra.atividade3;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario() {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double calcularSalario(double salarioComAumento) {

        if (this.cargo.equalsIgnoreCase("Atendente")) {
            salarioComAumento = this.salario * 0.05 + this.salario;
        } else if (this.cargo.equalsIgnoreCase("Treinador")) {
            salarioComAumento = this.salario * 0.10 + this.salario;
        } else if (this.cargo.equalsIgnoreCase("Gerente")) {
            salarioComAumento = this.salario * 2 + this.salario;
        }
        return salarioComAumento;
    }

    public void mostrarInformacoes() {
        if (this.cargo.equalsIgnoreCase("Atendente")) {
            System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario + " com aumento de 5% " + calcularSalario(this.salario));
        }
        if (this.cargo.equalsIgnoreCase("Treinador")) {
            System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario + " com aumento de 10% " + calcularSalario(this.salario));
        }
        if (this.cargo.equalsIgnoreCase("Gerente")) {
            System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario + " com aumento de 200% " + calcularSalario(this.salario));
        }
    }
}
