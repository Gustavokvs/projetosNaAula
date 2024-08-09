package br.ulbra.atividade3;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void verificarIdade() {
       
        String maior = "Você é considarado pela lei como maior de idade";
        String menor = "Você tem menos de 18 anos, portanto é menor de idade";

        if (this.idade < 18) {

            System.out.println("" + menor);

        } else {
            System.out.println("" + maior);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
