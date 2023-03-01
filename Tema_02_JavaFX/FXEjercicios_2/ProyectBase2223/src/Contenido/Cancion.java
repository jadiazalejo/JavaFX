/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;
public class Cancion extends Contenido {

    private String genero;
    private int duracion;
    private String ruta;
    private int favoritos;
    private int reproducciones;

    public Cancion(String genero, int duracion, String ruta, int id, String nombre) {
        super(id, nombre);
        this.genero = genero;
        this.duracion = duracion;
        this.ruta = ruta;
    }

    public void newFavorito() {
        favoritos += 1;
    }

    public void newReproduccion() {
        reproducciones += 1;
    }

    public int getFavoritos() {
        return favoritos;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String mostrarContenido() {

        return "Cancion \n"
                + "ID: " + super.getId() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Género: " + genero + "\n"
                + "Duración: " + duracion + "\n"
                + "Ruta: " + ruta + "\n"
                + "Favoritos: " + favoritos + "\n"
                + "Reproducciones: " + reproducciones + "\n";
    }

}

