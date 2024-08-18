package aprendendoPolimorfismo.Exercicios.newpackage;

public class Gato extends Animal {

    protected String corPelagem;

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
        int idade = this.idade - 1;
    }
}
