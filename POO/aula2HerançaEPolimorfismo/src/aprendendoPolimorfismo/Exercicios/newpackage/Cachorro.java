package aprendendoPolimorfismo.Exercicios.newpackage;

public class Cachorro extends Animal {

    protected String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public Cachorro(String raca, int idade, String nome, String tipo) {
        super(idade, nome, tipo);
        this.raca = raca;
    }

    
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void emitirSom(String som) {
        System.out.println(som);
    }

    public void correr() {
        System.out.println("O cachorro está correndo");
    }
}
