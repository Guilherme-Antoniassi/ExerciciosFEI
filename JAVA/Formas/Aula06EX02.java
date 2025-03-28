
package aula06ex02;

import java.util.ArrayList;

/**
 *
 * @author unifgaraujo
 */
public class Aula06EX02 {

  
    public static void main(String[] args) {
        
        ArrayList<Formas>formas=new ArrayList<>();
        
     formas.add(new Circulo());
     formas.add(new Retangulo());
     
     formas.get(0).setTipo("Circulo");
     ((Circulo)formas.get(0)).setRaio(8.7);
     
     formas.get(1).setTipo("Retangulo");
     ((Retangulo)formas.get(1)).setComprimento(5.4);
     ((Retangulo)formas.get(1)).setLargura(7.2);
     
     formas.get(0).print();
     formas.get(1).print();
    }
    
}
