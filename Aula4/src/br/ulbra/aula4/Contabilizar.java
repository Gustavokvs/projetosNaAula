package br.ulbra.aula4;

public class Contabilizar {

    private int saidas;
    private int entradas;
    private int saldo;

    public Contabilizar() {
        this.saidas = 0;
        this.entradas = 0;
        this.saldo = 0;
    }

    public void entradasEstoque(int entradasNoEstoque) {

        if (this.entradas >= 1) {
            entradasNoEstoque += this.entradas;
            this.saldo += entradasNoEstoque;
        } else if (this.entradas <= 0 && this.saidas <= 0 || this.entradas == 0 && this.saidas > 0) {

            System.out.println("Não é possivel saldo negativo ou nulo");
        }
    }

    public void saidasEstoque(int saidasDoEstoque) {
        if (this.saidas >= 1) {
            saidasDoEstoque += this.saidas;
            this.saldo -= saidasDoEstoque;
        } else if (this.saidas < 0 || this.saidas == 0 && this.entradas <= 0) {
            System.out.println("Não é possivel saldo negativo ou nulo");
        }
    }

    public void contarEstoque(int contagemDeEstoque) {
        contagemDeEstoque = this.entradas - this.saidas;

    }

    public int getSaidas() {
        return saidas;
    }

    public void setSaidas(int saidas) {
        this.saidas = saidas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

}
