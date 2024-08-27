package exercicios;

public class Area {

    public void calcularArea(int lado1) {

        double areaDoQuadrado;
        areaDoQuadrado = Math.pow(lado1, 2);
        System.out.println("A área do Quadrado é: " + areaDoQuadrado);
    }

    public void calcularArea(double largura, double altura) {
        double areaRetangulo = 0;
        areaRetangulo = largura * altura;
        System.out.println("A area do Retângulo é: " + areaRetangulo);

    }

    public void calcularArea(double raio) {
        double areaCirculo = 0;
        areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do Circulo é: " + areaCirculo);
    }

}
