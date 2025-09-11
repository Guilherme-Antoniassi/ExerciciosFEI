package testecontacorrente;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class TesteContaCorrente {

    /**
     * @param args nao recebo nada
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<ContaCorrente> contas = new ArrayList<>();

        ContaCorrente conta1=new ContaCorrente();
        contas.add(conta1);
         System.out.println("elementos da array: "+contas.size());
         contas.add(new ContaCorrente());
         System.out.println("elementos da array: "+contas.size());
         System.out.println("elementos da array: "+contas.size());
         System.out.println(contas);
         
         
         ContaCorrente conta2=contas.get(1);
         conta2.depositar(1000);
           System.out.println(contas);
           
           contas.get(0).depositar(20);
           System.out.println(contas);
           
           contas.get(0).sacar(5);
           System.out.println(contas);
           
           contas.get(1).sacar(10);
           System.out.println(contas);
    }

}
