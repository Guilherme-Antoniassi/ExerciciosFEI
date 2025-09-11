/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematica_main;

/**
 *
 * @author unifgaraujo
 */
public class Matematica_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroMaior=Matematica.max3(10, 22, 30);
        System.out.println("maior:"+numeroMaior);
        
        
        System.out.println("impar: "+Matematica.impar(true, false, false));
        
        System.out.println("Maioria:"+Matematica.maioria(false, true, true));
    }
    
}
