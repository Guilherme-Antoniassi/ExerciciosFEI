
package matrix;

/**
 *
 * @author Gui_a
 */
public class Professor extends Agente {
    private String escola;

    public Professor(String nome,String escola) {
        super(nome,"escola1");
        this.escola=escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    

    @Override
    public void apresentacao() {
        if(isModoAgente()){
            System.out.println("AGENTE SMITH");
        }
        else{
        System.out.println("ola eu sou "+getNome()+ "e sou aula na escola "+getEscola());
        }
    }
    
    
    
}
