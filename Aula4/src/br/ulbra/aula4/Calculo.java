package br.ulbra.aula4;

public class Calculo {

    private double raio;
    private double perimetro;
    private double areaCirculo;
    private double diametroCirculo;

    public Calculo() {
        this.raio = 0;
        this.perimetro = 0;
        this.areaCirculo = 0;
        this.diametroCirculo = 0;
       
    }

    public void calcularPerimetro() {
        this.perimetro = (2 * Math.PI) * this.raio;
    }

    public void calcularAreaDoCirculo() {
        this.areaCirculo = Math.PI * Math.pow(this.raio, 2);
    }

    public void calcularDiametro() {
        this.diametroCirculo = 2 * this.raio;
    }

    public void calcularValores() {
        calcularPerimetro();
        calcularAreaDoCirculo();
        calcularDiametro();
    }

    public void setRaio(double raio) {
        this.raio = raio;
        calcularValores();
    }

    public double getRaio() {
        return raio;
    }

    public void mostrarResultado() {
        System.out.println("Raio: " + this.raio
                + "\nPerimetro: " + this.perimetro
                + "\nArea: " + this.areaCirculo
                + "\nDiametro: " + this.diametroCirculo);
    }
}
