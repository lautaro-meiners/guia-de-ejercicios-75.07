package Practica1.EJ2ReproductorMusical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lautaro.meiners on 16/05/2016.
 */
public class ListaDeCanciones {
    private List<Cancion> canciones;
    private String nombreListaDeCanciones;

    public ListaDeCanciones (String nombre){
        canciones = new ArrayList<Cancion>();
        nombreListaDeCanciones = nombre;
    }

    public String nombreListaDeCanciones(){
        return nombreListaDeCanciones;
    }

    public List<Cancion> getLista() {
        System.out.print(nombreListaDeCanciones + ":");
        for (int i = 0; i < canciones.size(); i++)
            System.out.print(canciones.get(i));
            return canciones;
    }
}
