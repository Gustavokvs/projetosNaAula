package exercicios;

public class Desconto {

    private double preco;
    private String produto;

    public Desconto() {
        this.preco = 120.90;
        this.produto = "SSD MACROVIP 240";

    }

    public Desconto(String produto) {
        this.produto = produto;
    }

    public Desconto(double desconto) {

        desconto = this.preco - 0.10 * this.preco;
    }

    public Desconto(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public Desconto(String produto, double preco, double desconto) {
        this.produto = produto;
        desconto = desconto / 100 * preco;
        this.preco = preco - desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "preco= " + this.preco + " produto= " + this.produto;
    }

}
