/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa.main;

import java.util.ArrayList;

/**
 *
 * @author unifgaraujo
 */
public class PessoaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Funcionario> func = new ArrayList<>();
        ArrayList<Gerente> geren = new ArrayList<>();

        func.add(new Funcionario("danilo", 123456, new Data(12, 1, 2000), new Data(20, 3, 2019), 1800));
        func.add(new Funcionario("Orlando", 93850, new Data(17, 6, 1980), new Data(30, 7, 2001), 5100));
        geren.add(new Gerente("Oliver", 958321, new Data(15, 4, 1996), new Data(20, 8, 2015), 3000, 3, new Data(17, 10, 2025)));
        geren.add(new Gerente("Raimundo", 729546, new Data(1, 9, 1906), new Data(22, 4, 2013), 6000, 4, new Data(17, 12, 2019)));

        for (Funcionario f : func) {
            System.out.println("\nDados do funcionario: " + f.toString());

        }

        func.get(0).setSalario(1400);
        System.out.println("");
        System.out.println("dados do primeiro funcionario apos modificar salario:\n" + func.get(0));

        System.out.println("");

        for (Gerente g : geren) {
            System.out.println("\n Dados do gerente: " + g.toString());
            System.out.println("Departamento: " + g.getDepartamento());
        }

        geren.get(1).setDepartamento(5);

        System.out.println("");
        System.out.println("Departamento do 2 gerente apos edicao:\n " + geren.get(1));

        System.out.println("\n nome do primeiro funcionario antes de mudar: " + func.get(0).getNome());
        func.get(0).setNome("alexandre");

        System.out.println("nome do primeiro funcionario apos mudar: " + func.get(0).getNome());

    }

}
