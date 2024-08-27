package br.ulbra.atividade3;

import java.util.Scanner;

public class ContaDePalavras {

    public static void main(String[] args) {

        ManipulacaoString obj1 = new ManipulacaoString();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        obj1.setPalavra(ler.nextLine());

        obj1.contarCaractere();

    }
}
