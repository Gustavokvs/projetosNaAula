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

    public Desconto(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public Desconto(String produto, double preco, double desconto) {
        this.produto = produto;
        desconto = desconto / 100 * preco;
        this.preco = preco - desconto;
        System.out.println("Preço: " + preco + " Desconto: " + desconto + " Preço final: " + this.preco);
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

    public void aplicarDesconto(double preco) {
        this.preco = preco;
        double desconto;
        desconto = 0.10 * this.preco;
        System.out.println("Preço: " + this.preco + " Desconto de 10%: " + desconto);
    }

    public void aplicarDesconto(double preco, double valorDesconto) {
        double desconto;
        this.preco = preco;
        desconto = (valorDesconto / 100) * this.preco;
        System.out.println("Preço: " + preco + " Desconto: " + desconto + "% " + "Preço final: " + this.preco);
    }

    @Override
    public String toString() {
        return "Desconto{" + "preco=" + preco + ", produto=" + produto + '}';
    }

}
