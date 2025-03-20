
package aula06ex02;

/**
 *
 * @author unifgaraujo
 */
public class Retangulo extends Formas {
    private double comprimento;
    private double largura;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double perimetro() {
      return 2*this.comprimento+2*this.largura;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("\nComprimento: %.2f \n Largura:%.2f \n Perimetro:%.2f",this.comprimento,this.largura,this.perimetro());
    }
    
    
}
