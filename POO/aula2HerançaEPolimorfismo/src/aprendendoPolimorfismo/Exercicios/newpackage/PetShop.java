package aprendendoPolimorfismo.Exercicios.newpackage;

public class PetShop {

    public static void main(String[] args) {

        Cachorro cac = new Cachorro("York", 5, "Aquiles", "Cão");
        Gato gat = new Gato("Frajola", 8, "Tininha", "Felino");

        cac.emitirSom();
        cac.correr();
        System.out.println("\n");

        gat.emitirSom();
        gat.subirEmArvore();

        System.out.println("Idade do gato antes da caça: " + gat.getIdade());
        gat.cacar();
        System.out.println("Idade do gato depois da caça: " + gat.getIdade());

        gat.brincar();
        cac.brincar();
        System.out.println("A tininha começou a caçar");
        gat.cacar();
        System.out.println("Idade da " + gat.getNome() + "; " + gat.getIdade());

    }

}
