/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

public class Podcast extends Contenido {
    private int anyo;
    private String descripcion;
    private String imagen;

    public Podcast(int id, String nombre, int anyo, String descripcion, String imagen) {
        super(id, nombre);
        this.anyo = anyo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImage() {
        return imagen;
    }

    public void setImage(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String mostrarContenido() {
        String salida ="Podcast \n" +
            "ID: " + super.getId() + "\n" +
            "Nombre: " + super.getNombre() + "\n" +
            "Año: " + anyo + "\n" +
            "Descripción: " + descripcion + "\n" +
            "Imagen: " + imagen + "\n";
        return (salida);
    }
}