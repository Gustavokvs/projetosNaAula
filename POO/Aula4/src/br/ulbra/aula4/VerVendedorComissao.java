package br.ulbra.aula4;

import java.util.Scanner;

public class VerVendedorComissao {

    public static void main(String[] args) {

        Vendedor obj1 = new Vendedor();
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o nome do Vendedor?");
        obj1.setNome(ler.nextLine());
        System.out.println("Qual é a meta de vendas dele?");
        obj1.setMeta(ler.nextDouble());
        System.out.println("Quanto foi que ele vendeu?");
        obj1.setTotalVendido(ler.nextDouble());
        
        
        System.out.println("Segue os dados do Vendedor:");
        obj1.mostrarDados();
    }

}
