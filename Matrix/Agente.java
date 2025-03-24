
package matrix;
/**
 *
 * @author Gui_a
 */

abstract  class Agente {
    private String nome;
    private boolean modo_agente;
    private String profissao;

    public Agente(String nome, String profissao) {
        this.nome = nome;
        this.modo_agente = false;
        this.profissao = profissao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isModoAgente() {
        return modo_agente;
    }

    public void setModoAgente(boolean modoAgente) {
        this.modo_agente = modoAgente;
    }
    
    
    
  
     public void apresentacao(){
         if(modo_agente){
             System.out.println("AGENTE SMITH");
         }else{
             System.out.println("ola eu sou :"+getNome()+"e minha profissao e :"+getProfissao());
         }
         
     }
        
        public void modo_agente_on(){
            this.modo_agente=true;
            System.out.println("Modo agente ligado");
        }
    
}
