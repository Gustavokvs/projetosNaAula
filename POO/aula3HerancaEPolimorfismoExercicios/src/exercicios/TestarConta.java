package exercicios;

public class TestarConta {

    public static void main(String[] args) {
        Conta con = new Conta();

        System.out.println(con.toString());

        con.setId("20");
        System.out.println(con.toString());

    }

}
