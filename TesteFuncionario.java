
package com.mycompany.aula03ex03;

public class TesteFuncionario {
    
  public static void main(String[] args){
     Funcionario f1=new Funcionario();
     
     System.out.println("------Funcionarios");
     System.out.println("Nome-------"+f1.getNome());
     System.out.println("Sobrenome---"+f1.getSobrenome());
     System.out.println("Sexo----"+f1.getSexo());
     System.out.println("Numero----"+f1.getNumero());
     System.out.println("Idade---"+f1.getIdade());
     System.out.println("Salario-----"+f1.getSalario());
     
      
          Funcionario f2=new Funcionario("Gui","AA","M",12345,20,1000.00);

     
      System.out.println("------Funcionarios");
     System.out.println("Nome-------"+f2.getNome());
     System.out.println("Sobrenome---"+f2.getSobrenome());
     System.out.println("Sexo----"+f2.getSexo());
     System.out.println("Numero----"+f2.getNumero());
     System.out.println("Idade---"+f2.getIdade());
     System.out.println("Salario-----"+f2.getSalario());
  }
            
    
}
