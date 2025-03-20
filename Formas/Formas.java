
package aula06ex02;

/**
 *
 * @author unifgaraujo
 */
public abstract class Formas {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double perimetro();
    
    public void print(){
        System.out.printf("\ntipo %s",this.tipo);
    }
        
    
}
