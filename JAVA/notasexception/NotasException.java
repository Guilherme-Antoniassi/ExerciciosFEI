package notasexception;

import java.util.Scanner;

/**
 *
 * @author unifgaraujo
 */
public class NotasException {

    public static void TestarNota(double nota) {

        if (nota < 0) {
            throw new NotaNegativaException("erro:nota menor q 0");
        }

        if (nota > 10) {
            throw new NotaAcima10Exception("erro:nota menor q 10");
        }
        System.out.println("Nota correta");

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double nota;
        try {
            System.out.println("digite uma nota");
            nota = scanner.nextDouble();
            TestarNota(nota);
        } catch (NotaNegativaException e) {

            System.out.println(e);
            nota=0;
        }
        catch(NotaAcima10Exception e){
            nota=10;
            System.out.println(e);
        }
        System.out.println("fim");
    }

}
