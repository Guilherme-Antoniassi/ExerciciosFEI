
package com.mycompany.cor;

import java.util.ArrayList;

public class CorTeste {
    public static void main(String[] args) {
        
        ArrayList<String> cores1=new ArrayList<>();
        ArrayList<String> cores2=new ArrayList<>();
        
        cores1.add("vermelho");
        cores1.add("laranja");
        cores1.add("azul");
        cores1.add("amarelo");
        
        cores2.add("roxo");
        cores2.add("laranja");
        cores2.add("verde");
        cores2.add("amarelo");
        
        for(int i=0;i<cores1.size(); i++){
            if(cores1.get(i).equals(cores2.get(i))){
                System.out.println("cores iguais"+i);
            }else{
                System.out.println("diferentes"+i);
            }
        }
    }
    
}
