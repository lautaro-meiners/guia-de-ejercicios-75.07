package Practica1.EJ2ReproductorMusical;


/**
 * Created by lautaro.meiners on 13/05/2016.
 * From: http://campus.fi.uba.ar/pluginfile.php/109324/mod_resource/content/1/7507GuaEjerciciosPr%C3%A1cticos.pdf
 * Contacto: lautaromeiners@gmail.com
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
