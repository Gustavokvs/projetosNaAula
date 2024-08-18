package aprendendoPolimorfismo.Exercicios.newpackage;

public class PetShop {

    public static void main(String[] args) {

        Cachorro cac = new Cachorro();
        Gato gat = new Gato();

        System.out.println("O cachorro faz");
        cac.emitirSom();
        cac.emitirSom("Auff Auff");
        cac.correr();

        System.out.println("\nO Gato faz");
        gat.emitirSom();
        gat.subirEmArvore();
        gat.setIdade(8);
        gat.cacar();
        System.out.println("O gato tem "+this.idade);
    }

}
