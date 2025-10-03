/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Soma;
import View.Janela;

/**
 *
 * @author unifgaraujo
 */
public class Controle {
    
    private Janela j;
    
    public Controle(Janela j) {
        this.j = j;
    }
    
    public void controlarLimpar() {
        j.getTxt_num1().setText("");
        j.getTxt_num2().setText("");
        j.getTxt_resultado().setText("");
    }
    
    public void controleSomar() {
        double n1 = Double.parseDouble(j.getTxt_num1().getText());
        double n2 = Double.parseDouble(j.getTxt_num2().getText());
        Soma s = new Soma();
        double r = s.calcular(n1, n2);
        j.getTxt_resultado().setText(String.valueOf(r));
        
    }
}
