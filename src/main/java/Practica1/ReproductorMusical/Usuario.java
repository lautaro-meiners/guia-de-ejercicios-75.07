package Practica1.ReproductorMusical;

import static Practica1.ReproductorMusical.Catalogo.canciones;

/**
 * Created by lautaro.meiners on 13/05/2016.
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

            case 3:
                System.out.println("Duracion total de la reproduccion");
                this.duracionTotalReproduccion();
                break;
        }
    }

    public static void cerrarScanner() {
        InputsDeConsola.cerrar();
    }

    private void agregarUnaCancion() {
        System.out.println("Escribir el: Titulo, Banda y duracion the la cancion que quiera agregar");
        Cancion cancion = new Cancion(InputsDeConsola.leerString(), InputsDeConsola.leerString(), InputsDeConsola.leerInt());
        Catalogo.agregarCancion(cancion);
        Catalogo.mostrarCanciones().forEach(s -> System.out.println(s.toString()));
    }

    private void agregarListaDeCanciones() {
        System.out.println("");

    }


    private void duracionTotalReproduccion() {
        int duracionTotal = 0;
        for (int t = 0; t < canciones.size(); t++) {
            duracionTotal += canciones.get(t).getDuracion();
            System.out.println("La duraccion total es: " + duracionTotal);
        }

    }
}