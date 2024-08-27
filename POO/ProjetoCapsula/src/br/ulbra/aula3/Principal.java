package br.ulbra.aula3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Animal dog = new Animal();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do animal:");
        dog.setNome(ler.nextLine());
        System.out.println("Digite a Idade:");
        dog.setIdade(ler.nextInt());
        System.out.println("Digite o Peso");
        dog.setPeso(ler.nextDouble());
        System.out.println("Digite true Para Vacinado, ou False para Não Vacinado");
        dog.setVacinado(ler.nextBoolean());
        System.out.println("Nome: " + dog.getNome());
        System.out.println("Idade: " + dog.getIdade());
        System.out.println("Peso " + dog.getPeso());
        if (dog.isVacinado()) {
            System.out.println("Vacinado: Sim");
        } else {
            System.out.println("Vacinado: Não ");
        }
    }

}
