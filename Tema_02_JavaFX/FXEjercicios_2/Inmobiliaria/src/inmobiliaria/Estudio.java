/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

public class Estudio extends Inmueble {

    private boolean despacho;

    public Estudio(boolean despacho, String numRegistro, String direccion, int numBanyos, int numDormi, String estado) {
        super(numRegistro, direccion, numBanyos, numDormi, estado);
        this.despacho = despacho;
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Estudio{" + "numRegistro=" + getNumRegistro() + "direccion=" + getDireccion() + "" + "Despacho= " + isDespacho()
                + "numero de Baños=" + getNumBanyos() + "numero de Dormitorios=" + getNumDormi() + ""
                + "Estado de la vivienda=" + getEstado() + '}';
    }

}