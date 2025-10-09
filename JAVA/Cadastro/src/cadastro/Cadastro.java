/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro;

import Controller.CadastroController;
import View.Janela_Cadastro;

/**
 *
 * @author unifgaraujo
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    CadastroController controller=new CadastroController();
    
    new Janela_Cadastro(controller).setVisible(true);
    }
    
}
