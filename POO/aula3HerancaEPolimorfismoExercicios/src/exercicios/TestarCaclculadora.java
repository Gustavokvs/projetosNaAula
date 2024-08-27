package exercicios;

public class TestarCaclculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("A subtração dos dois inteiros é: "+calc.subtrair(6,1));
        System.out.println("A subtração dos dois fracionários é: "+calc.subtrair(6.10,7.10));
        
        
    }
}
