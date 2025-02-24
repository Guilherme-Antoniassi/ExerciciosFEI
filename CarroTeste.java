
package aula04ex04;


public class CarroTeste {

 
    public static void main(String[] args) {
        
        Carro c1=new Carro();
        
            //Construtor parcialmente parametrizado
            Carro c2=new Carro("Civic",2022,8000.00);
            
                // construindo um objeto com Construtor totalmente parametrizado
                
                Carro c3=new Carro("fusca", "azul", 1980,2000.00,50000.00);
                
                System.out.println("dados do carro c1\n");
                System.out.println(c1);
                
                System.out.println("dados do carro c2\n");
                System.out.println(c2);
                
                System.out.println("dados do carro c3\n");
                System.out.println(c3);
    }
    
}
