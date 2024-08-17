package aprendendoPolimorfismo;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("A soma de dois inteiros é: " + calc.somar(2, 4));
        System.out.println("A soma de três valores inteiros é: " + calc.somar(3, 4, 5));
        System.out.println("A soma de dois valores fracionarios é: " + calc.somar(3.99, 6.99));
    }

}
