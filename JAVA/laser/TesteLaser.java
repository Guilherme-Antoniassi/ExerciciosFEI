package laser;

public class TesteLaser {

    public static void main(String[] args) {

        Laser l1[] = new Laser[10];

        for (int i = 0; i < 10; i++) {
            l1[i] = new Laser("tapeca", 20.0, 12, 20);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("fabricante:  " + l1[i].getFabricante());
            System.out.println("alcance:  " + l1[i].getAlcance());
            System.out.println("precisao:  " + l1[i].getPrecisao());
            System.out.println("medida:  " + l1[i].getMedida());

        }
    }

}
