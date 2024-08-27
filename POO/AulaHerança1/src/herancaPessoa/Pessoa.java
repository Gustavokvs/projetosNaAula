package herancaPessoa;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void cadastrar(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
}
