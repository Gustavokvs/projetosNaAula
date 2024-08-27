package exercicios;

public class TestarComparador {

    public static void main(String[] args) {

        Comparador com = new Comparador();

        System.out.println(com.retornarMaiorNumero(15, 10));

        System.out.println(com.retornarMaiorNumero(11, 10, 90));

        System.out.println(com.retornarMaiorNumero(15.2, 15.3));

    }

}
