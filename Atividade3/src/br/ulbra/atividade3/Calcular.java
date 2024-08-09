package br.ulbra.atividade3;

import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) {

        Calculadora obj1 = new Calculadora();
        Scanner ler = new Scanner(System.in);

        System.out.println("Que numero gostaria de Calcular?");
        obj1.setNumero(ler.nextDouble());

        System.out.println("E que tipo de conta gostaria de fazer?\nRaiz ou Potência\nDigite 1 para Raiz, 2 para potência.");
        int op = ler.nextInt();
        if (op == 1) {
            System.out.println("Raiz: " + obj1.calcularRaiz(obj1.getNumero()));
        } else {
            System.out.println("Preciso então que você me diga, gostaria do numero " + obj1.getNumero() + " Elevado a qual expoente?");
            double numero1 = obj1.getNumero();
            double numero2 = ler.nextInt();
            System.out.println("Potência: " + obj1.calcularPotencia(numero1, numero2));

        }

    }

}
