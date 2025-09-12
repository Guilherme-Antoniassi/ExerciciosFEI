/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapolitico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifgaraujo
 */
public class SistemaPolitico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Prefeito> p = new ArrayList<>();
        ArrayList<Vereador> v = new ArrayList<>();

        String nomeLocal, partidoLocal, estadoLocal, funcaoLocal, municipioLocal;

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o nome do  vereador: ");
            nomeLocal = scanner.nextLine();

            System.out.println("digite o partido do  vereador:");
            partidoLocal = scanner.nextLine();

            System.out.println("digite o estado no  vereador: ");
            estadoLocal = scanner.nextLine();

            System.out.println("digite a funcao do  vereador: ");
            funcaoLocal = scanner.nextLine();

            System.out.println("digite o municipio do  vereador:");
            municipioLocal = scanner.nextLine();

            v.add(new Vereador(nomeLocal, partidoLocal, estadoLocal, funcaoLocal, municipioLocal));
        }

        System.out.println("dados dos vereadores:---------------");
        for (Vereador v1 : v) {
            v1.apresentacao();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o nome do prefeito  ");
            nomeLocal = scanner.nextLine();

            System.out.println("digite o partido do prefeito ");
            partidoLocal = scanner.nextLine();

            System.out.println("digite o estado do prefeito ");
            estadoLocal = scanner.nextLine();

            System.out.println("digite a funcao do prefeito  ");
            funcaoLocal = scanner.nextLine();

            System.out.println("digite o municipio do prefeito");
            municipioLocal = scanner.nextLine();

            p.add(new Prefeito(nomeLocal, partidoLocal, estadoLocal, funcaoLocal, municipioLocal));
        }
        System.out.println("dados do prefeito:----------------");

        for (Prefeito p1 : p) {
            p1.apresentacao();
        }
    }

}
