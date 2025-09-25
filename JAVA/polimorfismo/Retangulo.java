/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.polimorfismo;

/**
 *
 * @author unifgaraujo
 */
public class Retangulo extends Formas{
    
    private double comprimento,largura;

    public Retangulo(double comprimento,double largura) {
        super("Retangulo");
        this.comprimento=comprimento;
        this.largura=largura;
    }

    @Override
    public double Perimetro() {
        return 2*(largura+comprimento);
    }
    
    @Override
    public void Print(){
        System.out.println("Retangulo:"+comprimento+largura);  
    }
}
