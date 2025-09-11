/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematica_main;

/**
 *
 * @author unifgaraujo
 */
public class Matematica {

    public static int max3(int valor1, int valor2, int valor3) {
        if (valor1 > valor2) {
            if (valor1 > valor3) {
            }
            return valor1;
        } else {
            if (valor2 > valor3) {
                return valor2;
            } else {
                return valor3;
            }

        }

    }

    public static boolean impar(boolean i1, boolean i2, boolean i3) {
        return !i1 && !i2 && i1 || !i1 && i2 && i1 || i1 && !i2 && i1 || i1 && i2 && i1;
    }

    public static boolean maioria(boolean arg1, boolean arg2, boolean arg3) {
        return !arg1 && !arg2 && arg1 || !arg1 && arg2 && arg1 || arg1 && !arg2 && arg1 || arg1 && arg2 && arg1;
    }
}
