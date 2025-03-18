
package contas;

import java.util.Scanner;

/**
 *
 * @author unifgaraujo
 */
public class Contas {

    public static void main(String[] args) {

        OperacaoMatematica operacao;
        
        Scanner scanner=new Scanner(System.in);
        String op=scanner.nextLine();
        
        if(op.equalsIgnoreCase("soma")){
            operacao=new Soma();
        }else {
           if(op.equalsIgnoreCase("Subtracao")){
               operacao=new Subtracao();
           }else{
               if(op.equalsIgnoreCase("Divisao")){
                   operacao= new Divisao();
               } else{
                   operacao=new Mutiplicacao();
               }
           }
        }
        System.out.println("resultado:"+operacao.calcular(5, 5));
    }
    
}
