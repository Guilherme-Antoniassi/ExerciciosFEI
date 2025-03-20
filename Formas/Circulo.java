
package aula06ex02;

/**
 *
 * @author unifgaraujo
 */
public  class Circulo extends Formas {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double perimetro() {
             return 2*raio*Math.PI;
    }
    
    public double area(){
        return Math.PI*Math.pow(this.raio,2);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("\n area: %2.f\nPerimetro: %.2f",this.area(),this.perimetro());
  
  this.area();
  this.perimetro();
    }
    
    
    
}
