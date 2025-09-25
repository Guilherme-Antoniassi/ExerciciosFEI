/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.polimorfismo;

/**
 *
 * @author unifgaraujo
 */
public class Circulo extends Formas {

    private double raio;


    public Circulo(double raio) {
        super("circulo");
        this.raio=raio;
    }

    public double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public void Print(){
        System.out.println("raio do circulo:"+raio);
    }
}
