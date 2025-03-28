package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Agente> ag = new ArrayList<>();

        while (true) {

            System.out.println("------MENU-----");
            System.out.println("1-criar novo empresario");
            System.out.println("2-Criar novo professor");
            System.out.println("3-Criar novo advogado");
            System.out.println("4-Se apresentarem");
            System.out.println("5-Ativar modo agente");
            System.out.println("6-sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do empresario");
                    String nomeEmpresario = scanner.nextLine();
                    
                    System.out.println("Nome da empresa:");
                    String nomeEmpresa=scanner.nextLine();
                    
                    ag.add(new Empresaio(nomeEmpresario,nomeEmpresa));
                    break;
                    
                case 2:
                    System.out.println("Digite nome do professor");
                    String nomeProfessor=scanner.nextLine();
                    
                    System.out.println("nome da escola");
                    String escola=scanner.nextLine();
                    
                    ag.add(new Professor(nomeProfessor,escola));
                    break;
                    
                case 3:
                    System.out.println("Digite o nome do advogado");
                    String nomeAdvogado=scanner.nextLine();
                    
                    System.out.println("nome da OAB");
                    String oab=scanner.nextLine();
                    
                    ag.add(new Advogado(nomeAdvogado,oab));
                    break;
                    
                case 4:
                    System.out.println("Apresentacoes:");
                    for(Agente agete:ag){
                        agete.apresentacao();

                       
                    }
                         break;
                        
                case 5:
                    System.out.println("Escolha um numero da lista de funcionario para ativar modo agente");
                    for(int i=0;i<ag.size();i++){
                        System.out.println(i+"-"+ag.get(i).getNome());
                    }
                    int opcao2=scanner.nextInt();
                    if(opcao2>=0 && opcao2<ag.size()){
                    ag.get(opcao2).modo_agente_on();
                }else{
                        System.out.println("numero invalido");
                        break;
                        
                    }
                case 6:
                   
                   
                    break;

                default:
                    System.out.println("opcao invalida");

            }

        }

    }

}
