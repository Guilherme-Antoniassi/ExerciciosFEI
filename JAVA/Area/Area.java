
package aula06ex03;

/**
 *
 * @author unifgaraujo
 */
public class Area {
    public void imprimirArea(double lado){
        System.out.printf("\narea do quadrado: %.2f",Math.pow(lado, 2));
    }
    
    public void imprimirArea(double lado1, double lado2){
        System.out.printf("\nArea do retangulo: %.2f",lado1,lado2);
    }
}
