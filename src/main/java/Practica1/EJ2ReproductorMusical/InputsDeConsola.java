package Practica1.EJ2ReproductorMusical;

import java.util.Scanner;

/**
 * Created by lautaro.meiners on 13/05/2016.
 */
public class InputsDeConsola {
    private static Scanner sc = new Scanner (System.in);

    public static void cerrar(){
        sc.close();
    }

    public static int leerInt(){
        return sc.nextInt();
    }

    public static String leerString(){
        return sc.next();
    }
}
