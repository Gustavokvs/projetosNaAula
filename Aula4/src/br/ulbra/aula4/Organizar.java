package br.ulbra.aula4;

import java.util.Scanner;

public class Organizar {
    
    public static void main(String[] args) {
        
        Contabilizar obj1 = new Contabilizar();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual foi o produto Adicionado?");
        obj1.setProduto(ler.nextLine());
        System.out.println("Quantos Destes produtos deseja dar entrada?");
        obj1.setEntradas(ler.nextInt());
        System.out.println("E quantas saidas se teve?");
        obj1.setSaidas(ler.nextInt());
        
        obj1.contarEstoque();
        obj1.mostrarResultados();
        
    }
    
}
