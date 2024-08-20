package exercicios;

public class Calculadora {

    public int subtrair(int numero1, int numero2) {
        int resultado = 0;
        resultado = numero1 - numero2;
        return resultado;

    }

    public double subtrair(double numero1, double numero2) {
        double subtracao = 0;
        if (numero1 > numero2) {
            subtracao = numero1 - numero2;
        } else {
            subtracao = numero2 - numero1;
        }

        return subtracao;
    }

}
