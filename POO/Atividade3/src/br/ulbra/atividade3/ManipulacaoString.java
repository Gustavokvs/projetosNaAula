package br.ulbra.atividade3;

public class ManipulacaoString {

    private String palavra;

    public ManipulacaoString() {

        this.palavra = "";

    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void contarCaractere() {

        int contador = this.palavra.length();

        if (contador % 2 == 0) {

            System.out.println("tem " + this.palavra.length() + " caracteres" + "\né par");

        } else {
            System.out.println("tem " + this.palavra.length() + " caracteres" + "\né impar");
        }
    }

}
