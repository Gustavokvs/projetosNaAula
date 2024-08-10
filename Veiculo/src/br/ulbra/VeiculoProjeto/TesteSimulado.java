package br.ulbra.VeiculoProjeto;

import java.util.Scanner;

public class TesteSimulado {

    public static void main(String[] args) {
        Veiculo obj1 = new Veiculo();
        Veiculo obj2 = new Veiculo();
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é a marca do seu Carro? ");
        obj1.setMarca(ler.nextLine());

        System.out.println("Qual é o modelo dele?");
        obj1.setModelo(ler.nextLine());

        System.out.println("Qual é o ano de fabricação do seu veículo?");
        obj1.setAno(ler.nextInt());

        System.out.println("Agora é do Segundo Objeto.");

        System.out.println("Qual é a marca do seu Carro? ");
        obj2.setMarca(ler.next());

        System.out.println("Qual é o modelo dele?");
        obj2.setModelo(ler.next());

        System.out.println("Qual é o ano de fabricação do seu veículo?");
        obj2.setAno(ler.nextInt());

        System.out.println("Seus veículos são:");

        obj1.mostrarResultado();
        System.out.println("OBJ2");
        obj2.mostrarResultado();
    }

}
