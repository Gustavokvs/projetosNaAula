package newpackage;

public class Retangulo {

    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public Retangulo() {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularPerimetro() {

        this.perimetro = 2 * this.lado1 + 2 * this.lado2;
        System.out.println("Calculo Perimetro: 2x " + this.lado1 + " + 2x " + this.lado2 + " = " + this.perimetro);
    }

    public void calcularArea() {

        this.area = lado1 + lado2;
        System.out.println("Calculo Area: " + lado1 + " + " + lado2 + " = " + this.area);
    }

}
