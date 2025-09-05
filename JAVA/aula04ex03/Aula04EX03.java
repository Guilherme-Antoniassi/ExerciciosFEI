
package aula04ex03;

import java.util.ArrayList;

public class Aula04EX03 {


    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nomes1=new ArrayList<>();
        
        nomes1.add("rafael");
        nomes1.add("guilherme");
        nomes1.add("rafaela");

         ArrayList<String> nomes2=new ArrayList<>(nomes1);
        
         // nomes2=nomes1;
         
         nomes1.set(0, "gabi");
         
         System.out.println(nomes1);
         System.out.println(nomes2);
    }
    
}
