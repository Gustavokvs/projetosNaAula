package herancaPessoa;

public class Paciente extends Pessoa {

    private String matricula;

    public Paciente(String matricula, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
    }

    public void cadastrar(String matricula) {
        super.cadastrar(nome, idade, sexo);
        this.matricula = matricula;
        System.out.println("Matricula: " + matricula);
    }
}
