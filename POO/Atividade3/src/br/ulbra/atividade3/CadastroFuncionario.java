package br.ulbra.atividade3;

import java.util.Scanner;

public class CadastroFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario obj1 = new Funcionario();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual é seu nome?");
        obj1.setNome(ler.nextLine());
        System.out.println("Qual é seu cargo? você é Atendente, Treinador ou Gerente?");
        obj1.setCargo(ler.nextLine());
        System.out.println("Qual é o seu salario atual?");
        obj1.setSalario(ler.nextDouble());
        
        
        obj1.mostrarInformacoes();
        
    }
    
}
