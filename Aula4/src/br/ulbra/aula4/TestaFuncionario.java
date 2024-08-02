package br.ulbra.aula4;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario ind1 = new Funcionario();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        ind1.setNomeFuncionario(ler.nextLine());
        System.out.println("Digite o cargo:");
        ind1.setCargo(ler.nextLine());
        System.out.println("Digite o Valor por hora:");
        ind1.setValorHora(ler.nextDouble());
        System.out.println("Digite o Total de horas trabalhadas:");
        ind1.setTotalDeHoras(ler.nextInt());
        System.out.println("Digite o desconto:");
        ind1.setDesconto(ler.nextDouble());
        
        
        System.out.println("Nome: "+ind1.getNomeFuncionario());
        System.out.println("Cargo: "+ind1.getCargo());
        ind1.calcularSalarioLiquido();
        ind1.calcularSalarioBruto();
        

    }

}
