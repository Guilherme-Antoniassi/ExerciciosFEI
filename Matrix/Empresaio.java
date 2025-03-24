
package matrix;

/**
 *
 * @author Gui_a
 */

class  Empresaio extends Agente{
    private String empresa;

    public Empresaio(String nome,String empresa) {
        super(nome,"empresario");
        this.empresa=empresa;
    }

     
   
    @Override
    public void apresentacao() {
      if(isModoAgente()){
          System.out.println("AGENTE SMITH");
      }else{
          System.out.println("ola eu sou "+getNome()+" e sou empresario da empresa "+empresa);
      }
       
    }
    
    
    
}
