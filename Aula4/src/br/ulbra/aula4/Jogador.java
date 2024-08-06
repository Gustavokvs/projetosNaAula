package br.ulbra.aula4;

import java.util.Scanner;

public class Jogador {

    public static void main(String[] args) {

        RegistroJogador obj1 = new RegistroJogador();
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o jogador?");
        obj1.setNome(ler.nextLine());
        System.out.println("Qual é o ano de nascimento dele?");
        obj1.setDataDeNascimento(ler.nextInt());
        System.out.println("Qual a nacionalidade dele?");
        obj1.setNacionalidade(ler.next());
        System.out.println("Qual é a posição em que ele joga?");
        obj1.setPosicao(ler.next());
        System.out.println("Qual é a altura dele?");
        obj1.setAltura(ler.nextDouble());
        System.out.println("Qual é o peso dele?");
        obj1.setPeso(ler.nextDouble());

        System.out.println("De acordo com as informações fornecidas:");

        obj1.mostrarResultado();
    }
}
