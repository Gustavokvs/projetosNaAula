package exercicios;

public class Comparador {

    public int retornarMaiorNumero(int numero1, int numero2) {
        int maior;
        if (numero1 >= numero2) {
            maior = numero1;

        } else {
            maior = numero2;
        }
        return maior;
    }

    public int retornarMaiorNumero(int numero1, int numero2, int numero3) {
        int maior = 0;
        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;

        } else if (numero2 >= numero3) {

            maior = numero2;

        } else {

            maior = numero3;

        }
        return maior;
    }

    public double retornarMaiorNumero(double numero1, double numero2) {
        double maior = 0;

        if (numero1 >= numero2) {
            maior = numero1;
        } else {
            maior = numero2;
        }
        return maior;
    }

}
