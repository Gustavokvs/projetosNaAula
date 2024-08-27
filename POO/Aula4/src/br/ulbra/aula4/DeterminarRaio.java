package br.ulbra.aula4;

import java.util.Scanner;

public class DeterminarRaio {

    public static void main(String[] args) {

        Calculo obj1 = new Calculo();
        Scanner ler = new Scanner(System.in);

        System.out.println("Vou fazer o Calculo de \nDiametro\nArea\ne Perimetro para você\npor favor, insira o valor do Raio.");
        obj1.setRaio(ler.nextDouble());
        
        obj1.mostrarResultado();
    }
}
