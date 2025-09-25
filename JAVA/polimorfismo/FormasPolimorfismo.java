package formas.polimorfismo;

/**
 *
 * @author unifgaraujo
 */
public class FormasPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Formas forma = new Circulo(10);
        Formas forma2 = new Retangulo(5, 10);

        System.out.println("perimetro 01-" + forma.Perimetro());
        System.out.println("perimetro 02-" + forma2.Perimetro());

        forma.Print();
        forma2.Print();

        System.out.println(((Circulo) forma).area());
    }

}
