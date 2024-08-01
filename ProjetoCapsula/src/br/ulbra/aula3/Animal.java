package br.ulbra.aula3;

public class Animal {

    private String nome;
    private int idade;
    private double peso;
    private boolean vacinado;

    public Animal() {
    }

    public void vacinar() {
        this.vacinado = true;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome + "\n Idade: " + this.idade + "\n Peso: " + this.peso + " \n vacinado? " + this.vacinado);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isVacinado() {
        return vacinado;
    }
}
