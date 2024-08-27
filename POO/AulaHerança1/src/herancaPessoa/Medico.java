package herancaPessoa;

public class Medico extends Pessoa {

    private String crm;

    public Medico(String crm, String nome, int idade, String sexo) {

        super(nome, idade, sexo); //Pegando as informações do construtor do PAI (Pessoa)

        this.crm = crm;

    }

    public void cadastrar(String crm, String nome, int idade, String sexo) {
        
        super.cadastrar(nome, idade, sexo); //Está pegando as informações do método pai (cadastrar)
        this.crm = crm;
        
        System.out.println("CRM: " + crm);
        
    }
}
