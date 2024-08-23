package exercicios;

public class TestarDesconto {

    public static void main(String[] args) {
        Desconto des = new Desconto();

        des.aplicarDesconto(180.65);
        des.aplicarDesconto(200, 20);
    }

}
