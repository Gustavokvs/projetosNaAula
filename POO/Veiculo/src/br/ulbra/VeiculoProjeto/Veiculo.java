package br.ulbra.VeiculoProjeto;

public class Veiculo {

    private String marca, modelo;
    private int ano;

    public Veiculo() {
        this.marca = this.marca;
        this.modelo = this.modelo;
        this.ano = this.ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarResultado() {

        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno de fabricação: " + this.ano);

    }

}
