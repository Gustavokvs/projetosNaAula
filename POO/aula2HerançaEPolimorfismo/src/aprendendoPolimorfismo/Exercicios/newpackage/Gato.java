package aprendendoPolimorfismo.Exercicios.newpackage;

public class Gato extends Animal {

    protected String corPelagem;

    public Gato(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public Gato(String corPelagem, int idade, String nome, String tipo) {
        super(idade, nome, tipo);
        this.corPelagem = corPelagem;
    }

    
    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void subirEmArvore() {
        System.out.println("O gato subiu na árvore.");
    }

    public void cacar() {
    this.idade -= 1;
    }
}
