package br.ulbra.aula4;

public class Vendedor {

    private String nome;
    private double meta;
    private double totalVendido;

    public Vendedor() {

        this.nome = "";
        this.meta = 0;
        this.totalVendido = 0;

    }

    public double calcularComissao() {
        double comissao = 0;

        double percentualMeta50 = 0.50 * this.meta;
        double percentualMeta75 = 0.75 * this.meta;
        double percentualMeta100 = 1.00 * this.meta;

        if (this.totalVendido < percentualMeta50) {
            comissao = this.totalVendido * 0.01; // 1%
        } else if (this.totalVendido <= percentualMeta75) {
            comissao = this.totalVendido * 0.025; // 2.5%
        } else if (this.totalVendido <= percentualMeta100) {
            comissao = this.totalVendido * 0.035; // 3.5%
        } else {
            comissao = this.totalVendido * 0.05; // 5%
        }

        return comissao;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome
                + "\nMeta: " + this.meta
                + "\nTotal Vendido:" + this.totalVendido
                + "\nComissão: " + calcularComissao());
    }

    public void setNome(String NomeFuncionario) {
        this.nome = NomeFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

}
