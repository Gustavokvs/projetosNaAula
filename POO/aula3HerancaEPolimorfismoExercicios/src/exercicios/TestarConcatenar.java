package exercicios;

public class TestarConcatenar {


    public static void main(String[] args) {
        
        
        Concatenador conc = new Concatenador();
        
        conc.concatenar("Estou", "me esforçando");
        
        System.out.println(""+conc.concatenar("isso", "n é", "só um sout"));
        
    }
    
    
}
