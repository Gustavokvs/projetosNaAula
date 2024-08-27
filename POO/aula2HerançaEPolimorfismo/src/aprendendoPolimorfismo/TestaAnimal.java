package aprendendoPolimorfismo;

public class TestaAnimal extends Animal {

    public static void main(String[] args) {
        Animal meuCao = new Cachorro();
        Animal meuGato = new Gato();
        meuCao.fazerSom();
        meuGato.fazerSom();
    }

}
