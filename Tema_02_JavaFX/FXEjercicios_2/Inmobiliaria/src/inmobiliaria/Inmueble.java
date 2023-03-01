/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

public abstract class Inmueble {

    private final String numRegistro;
    private String direccion;
    private int numBanyos;
    private int numDormi;
    private String estado;

    public Inmueble(String numRegistro, String direccion, int numBanyos, int numDormi, String estado) {
        this.numRegistro = numRegistro;
        this.direccion = direccion;
        this.numBanyos = numBanyos;
        this.numDormi = numDormi;
        this.estado = estado;

    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumBanyos() {
        return numBanyos;
    }

    public int getNumDormi() {
        return numDormi;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public abstract String toString();

}
