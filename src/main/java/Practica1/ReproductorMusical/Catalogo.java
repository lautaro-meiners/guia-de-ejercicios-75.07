package Practica1.ReproductorMusical;

import java.util.ArrayList;

/**
 * Created by lautaro.meiners on 13/05/2016.
 */
public class Catalogo {
    public static ArrayList<Cancion> canciones = new ArrayList<Cancion>();
    private int cuenta;

    public static ArrayList<Cancion> mostrarCanciones(){
        return canciones;
    }

    public static void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

//    public int duracionTotal(){
//        int duracionTotal = 0;
//        for (int t= 0; t < canciones.size(); t++){
//            duracionTotal += canciones.get(t).getDuracion();
//        }
//        return duracionTotal;
//    }


}
