package Practica1.ReproductorMusical;


/**
 * Created by lautaro.meiners on 13/05/2016.
 */
public class Cancion {
    private String titulo;
    private String banda;
    private int duracion;

    public Cancion(String titulo, String banda, int duracion){
        this.titulo=titulo;
        this.banda=banda;
        this.duracion=duracion;
    }

    public String toString(){
        return "Titulo: " + titulo + " Banda: " + banda + " Duracion: " + duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getBanda() {
        return banda;
    }

    public int getDuracion() {
        return duracion;
    }


}
