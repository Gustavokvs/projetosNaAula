package exercicios;

public class TestarImpressora {

    public static void main(String[] args) {
        
        Impressora im = new Impressora();
        
        im.impressora("Olá");
        im.impressora("Meu nome é gustavo", "Alta");
        im.impressora("Eu to testando o método impressora", "alta", 1);
        
        
        
    }
    
}
