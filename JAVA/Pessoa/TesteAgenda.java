
package agenda;

import java.util.ArrayList;
import java.util.Scanner;


public class TesteAgenda {

 
    public static void main(String[] args) {
     
        ArrayList<Pessoa> contatos=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        
        while(true){
        System.out.println("Entre com a escolha desejada\n");
        
        System.out.println("Criar nova pessoa na agenda:1");
        System.out.println("Deletar pessoa na agenda:2");
        System.out.println("Imprimir toda agenda:3");
        System.out.println("Sair do programa:4" );;
     
         char opcao= scanner.nextLine().charAt(0);
         
         switch(opcao){
         
             case 'q':
                 break;
             case 'n':
                 System.out.println("Digite o nome");
                 String nome = scanner.nextLine();
                 System.out.println("Digite o telefone");
                 String telefone = scanner.nextLine();
                 
                 Pessoa p1 = new Pessoa(nome, telefone);
                 
                 contatos.add(p1);
                 
             case 'd':
                 
                 
             case 'p':
                 
                 for(Pessoa p: contatos){
                     System.out.println(p);
                 }
                    
         }
         
         
        
        
        
        
        }
    }
    
}
