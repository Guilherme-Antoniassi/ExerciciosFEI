
package agenda;


public class Pessoa {
    private static int contador=1;
    private int id;
    private  String nome;
    private String telefone;
   
    
    public Pessoa(String nome,String telefone){
        this.nome=nome;
        this.telefone=telefone;
    }

    public static int getContator() {
        return contador;
    }

    public static void setContator(int contator) {
        Pessoa.contador = contator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
      
}
