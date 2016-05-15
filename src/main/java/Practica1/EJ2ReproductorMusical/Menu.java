package Practica1.EJ2ReproductorMusical;

import java.util.Scanner;

/**
 * Created by lautaro.meiners on 13/05/2016.
 */
public class Menu {

    public static void llenarCatalogo(){
        Cancion cancion1 = new Cancion("A","B",4);
        Cancion cancion2 = new Cancion("C","D",2);
        Cancion cancion3 = new Cancion("E","F",4);
        Cancion cancion4 = new Cancion("G","H",3);
        Cancion cancion5 = new Cancion("I","J",4);
        Cancion cancion6 = new Cancion("K","L",8);
        Cancion cancion7 = new Cancion("M","N",2);
        Cancion cancion8 = new Cancion("O","P",4);

        Catalogo.agregarCancion(cancion1);
        Catalogo.agregarCancion(cancion2);
        Catalogo.agregarCancion(cancion3);
        Catalogo.agregarCancion(cancion4);
        Catalogo.agregarCancion(cancion5);
        Catalogo.agregarCancion(cancion6);
        Catalogo.agregarCancion(cancion7);
        Catalogo.agregarCancion(cancion8);

    }

    public static void main(String[] args) {

        llenarCatalogo();

        final Scanner scanner = new Scanner(System.in);

        System.out.println("\n========================================================="
                + "\n                                                           "
                + "\n    Bienvenidos al reproductor musical!                    "
                + "\n                                                           "
                + "\n                                                           "
                + "\n=========================================================");

        System.out.println("******************************************");
        System.out.println("1) Agregar una cancion");
        System.out.println("******************************************");
        System.out.println("2) Agregar una coleccion de canciones");
        System.out.println("******************************************");
        System.out.println("3) Duracion total de reproduccion");
        System.out.println("******************************************");
        System.out.println("4) Activar orden aleatorio");
        System.out.println("******************************************");
        System.out.println("5) Activar repeticion");
        System.out.println("******************************************");
        System.out.println("6) Reproducir");
        System.out.println("******************************************");

        int i = InputsDeConsola.leerInt();
        Usuario prueba = new Usuario();
        prueba.actividades(i);


    }
}
