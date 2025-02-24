
package aula03ex02;

import java.util.Scanner;


public class SwapperDemo {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       Swapper troca=new Swapper(); 
       
       System.out.println("Digite o x");
       double xLocal=scanner.nextDouble();
       troca.setX(xLocal);
       
              System.out.println("Digite o y");
       double yLocal=scanner.nextDouble();
       troca.setX(yLocal);
       
       
       System.out.println("antes da troca:");
       System.out.println("x:"+troca.getX());
       System.out.println("y:"+troca.getY());
       
       troca.swap();
       
         System.out.println("depois da troca:");
       System.out.println("x:"+troca.getX());
       System.out.println("y:"+troca.getY());
       
    }
    
}
