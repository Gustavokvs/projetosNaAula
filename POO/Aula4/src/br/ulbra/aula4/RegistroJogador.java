package br.ulbra.aula4;

public class RegistroJogador {

    //nome, posicao, dataDeNascimento, nacionalidade,altura,peso
    private String nome;
    private String posicao;
    private int dataDeNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public RegistroJogador() {

        this.nome = "";
        this.posicao = "";
        this.dataDeNascimento = 0;
        this.nacionalidade = "";
        this.altura = 0;
        this.peso = 0;

    }

    public int calcularIdade(int idade) {

        idade = 2024 - this.dataDeNascimento;

        return idade;
    }

    public int calcularAposentadoria(int aposentadoria) {
        int idade = 0;
        idade = calcularIdade(idade);

        if (this.posicao.equalsIgnoreCase("atacante")) {
            aposentadoria = 35 - idade;
        } else if (this.posicao.equalsIgnoreCase("defesa")) {
            aposentadoria = 40 - idade;
        } else if (this.posicao.equalsIgnoreCase("meiocampo") || this.posicao.equalsIgnoreCase("meio-campo") || this.posicao.equalsIgnoreCase("meio campo")) {
            aposentadoria = 38 - idade;
        } else if (idade > 40) {

            aposentadoria = 0;
        }

        return aposentadoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarResultado() {

        System.out.println("Nome: " + this.nome + "\nPosicao: " + this.posicao
                + "\nData de nascimento: " + this.dataDeNascimento + "\nIdade: " + calcularIdade(this.dataDeNascimento)
                + "\nNacionalidade: " + this.nacionalidade + "\nPeso: " + this.peso + "\nAltura: "
                + this.altura + "\nPode se aposentar em: " + calcularAposentadoria(this.dataDeNascimento) + " Anos");
    }

}
