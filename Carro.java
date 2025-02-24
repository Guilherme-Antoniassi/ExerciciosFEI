
package aula04ex04;


public class Carro {
    private String modelo,cor;
    private int ano;
    private double km,preco;
    
        //Construtor nao parametrizado
    public Carro(){
        
    }
    
    //Construtor parcialmente parametrizado
    public Carro(String modelo,int ano,double preco){
     this.modelo=modelo;
     this.ano=ano;
     this.preco=preco;
    }
    
       //Construtor totalmente parametrizado
    public Carro(String modelo,String cor,int ano,double km,double preco){
        this.modelo=modelo;
        this.cor=cor;
        this.ano=ano;
        this.km=km;
        this.preco=preco;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setKm(double km){
        this.km=km;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getAno(){
        return ano;
    }
    public double getKm(){
        return km;
    }
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano 
                + ", km=" + km + ", preco=" + preco + '}';
    }
    
    
}
