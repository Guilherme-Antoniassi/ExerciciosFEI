/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author unifgaraujo
 */
public class InterfaceAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Animal peixe=new Peixe();
      Animal passaro=new Passaro();
      Animal sapo=new Sapo();
      
      peixe.move();
      sapo.move();
      passaro.move();
    }
    
}
