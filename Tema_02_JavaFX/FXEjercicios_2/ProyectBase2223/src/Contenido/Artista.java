/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenido;

public class Artista extends Contenido{
    private String imagen;

    public Artista(int id, String nombre, String imagen) {
        super(id, nombre);
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String mostrarContenido() {
        String salida = "Artista \n" +
            "ID: " + super.getId() + "\n" +
            "Nombre: " + super.getNombre() + "\n" +
            "Imagen: " + imagen + "\n";
        return (salida);
    }
}