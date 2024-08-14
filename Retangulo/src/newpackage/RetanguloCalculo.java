
package newpackage;

public class RetanguloCalculo {
 
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        
        novoRetangulo.setLado1(10);
        novoRetangulo.setLado2(5);
        
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        
        
        novoRetangulo.setLado1(3);
        novoRetangulo.setLado2(5);
        
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
    }
    
}
