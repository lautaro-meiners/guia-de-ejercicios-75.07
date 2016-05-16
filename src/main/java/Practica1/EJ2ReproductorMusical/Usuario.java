package Practica1.EJ2ReproductorMusical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static Practica1.EJ2ReproductorMusical.Catalogo.canciones;

/**
 * Created by lautaro.meiners on 13/05/2016.
 * From: http://campus.fi.uba.ar/pluginfile.php/109324/mod_resource/content/1/7507GuaEjerciciosPr%C3%A1cticos.pdf
 */

public class Usuario {

    public static void inputsDeConsola() {
        InputsDeConsola.leerInt();
    }

    public void actividades(int i) {
        switch (i) {
            case 1:
                System.out.println("Agregar una cancion");
                this.agregarUnaCancion();
                break;

            case 2:
                System.out.println("Agregar una lista de canciones");
                this.agregarListaDeCanciones();
                break;


            case 3:
                System.out.println("Duracion total de la reproduccion");
                this.duracionTotalReproduccion();
                break;

            case 4:
                System.out.println("Orden aleatorio activado: ");
                this.activarOrdenAleatorio();
                break;

            case 5:
                System.out.println("Modo repeticion activado: ");
                this.activarRepeticion();
                break;

            case 6:
                System.out.println("Reproducir todo:");
                this.reproducir();
                break;


        }
    }

    private void activarRepeticion() {
    }

    private void reproducir() {
        Catalogo.mostrarCanciones().forEach(s -> System.out.println(s.toString()));
    }

    private void activarOrdenAleatorio() {
        Catalogo.mostrarCancionesShuffle().forEach(s -> System.out.println(s.toString()));
    }

    public static void cerrarScanner() {
        InputsDeConsola.cerrar();
    }

    public static void agregarUnaCancion() {
        System.out.println("Escribir el: Titulo, Banda y duracion the la cancion que quiera agregar");
        Cancion cancion = new Cancion(InputsDeConsola.leerString(), InputsDeConsola.leerString(), InputsDeConsola.leerInt());
        Catalogo.agregarCancion(cancion);
        Catalogo.mostrarCanciones().forEach(s -> System.out.println(s.toString()));
    }



    private void agregarListaDeCanciones() {
        System.out.println("Escribir el nombre y la cantidad de canciones de la lista que desea agregar");
        String playlist = InputsDeConsola.leerString();
        int cantidadDeCanciones = InputsDeConsola.leerInt();
        System.out.println("Usted agrego la playlist " + playlist + " con " + cantidadDeCanciones + " canciones");
        for (int i = 0; i < cantidadDeCanciones; i++){
            System.out.println("Escribir el: Titulo, Banda y duracion the la cancion que quiera agregar");
            Cancion cancion = new Cancion(InputsDeConsola.leerString(), InputsDeConsola.leerString(), InputsDeConsola.leerInt());
            Catalogo.agregarCancion(cancion);
        }
        Catalogo.mostrarCanciones().forEach(s -> System.out.println(s.toString()));
    }


    private void duracionTotalReproduccion() {
        int duracionTotal = 0;
        for (int t = 0; t < canciones.size(); t++) {
            duracionTotal += canciones.get(t).getDuracion();
        }
        System.out.println("La duraccion total es: " + duracionTotal + " minutos");

    }


}