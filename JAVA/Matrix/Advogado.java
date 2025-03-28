
package matrix;

/**
 *
 * @author Gui_a
 */
public class Advogado extends Agente{
    private String OAB;

    public Advogado(String nome,String OAB) {
        super(nome,"advogado");
        this.OAB=OAB;
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }

    @Override
    public void apresentacao() {
       if(isModoAgente()){
           System.out.println("agente smith");
       }else{
        System.out.println("ola eu sou "+getNome()+" e meu OAB é "+getOAB());
       }
    }
    
    
}
