package br.ulbra.atividade3;

import java.util.Scanner;

public class Individuo {
    

    public static void main(String[] args) {
        
        Pessoa obj1 = new Pessoa();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Olá, qual é seu nome?");
        obj1.setNome(ler.nextLine());
        System.out.println("Qual a sua altura?");
        obj1.setAltura(ler.nextDouble());
        System.out.println("E quantos anos você tem?");
        obj1.setIdade(ler.nextInt());
        
        
        obj1.verificarIdade();
        
        
        
        
    }


}
