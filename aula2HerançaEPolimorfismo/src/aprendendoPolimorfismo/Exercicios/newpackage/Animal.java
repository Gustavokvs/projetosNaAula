package aprendendoPolimorfismo.Exercicios.newpackage;

public class Animal {

    protected int idade;
    protected String nome;
    protected String tipo;

    public Animal() {
        this.idade = idade;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Animal(int idade, String nome, String tipo) {
        this.idade = idade;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void emitirSom() {

        System.out.println("O animal está emitindo som");

    }

}
