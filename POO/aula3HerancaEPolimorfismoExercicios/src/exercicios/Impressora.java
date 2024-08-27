package exercicios;

public class Impressora {

    public void impressora(String texto) {

        System.out.println(texto);

    }

    public void impressora(String texto, String caixa) {

        if (caixa.equalsIgnoreCase("alta") || caixa.equalsIgnoreCase("maiuscula")) {

            System.out.println(texto.toUpperCase());
        } else {
            System.out.println(texto);
        }

    }

    public void impressora(String texto, String caixa, int caracteres) {

        if (caixa.equalsIgnoreCase("alta") && caracteres == 1 || caixa.equalsIgnoreCase("maiuscula") && caracteres == 1) {

            System.out.println(texto.toUpperCase() + "\nN° de caracteres: " + texto.length());

        } else if (caixa.equalsIgnoreCase("alta") && caracteres == 0 || caixa.equalsIgnoreCase("maiuscula") && caracteres == 0) {

            System.out.println(texto.toUpperCase());

        } else if (caixa.equalsIgnoreCase("baixa") && caracteres == 1 || caixa.equalsIgnoreCase("minuscula") && caracteres == 1) {
            System.out.println(texto + "\nN° de caracteres: " + texto.length());
        } else {
            System.out.println(texto);
        }
    }

}
