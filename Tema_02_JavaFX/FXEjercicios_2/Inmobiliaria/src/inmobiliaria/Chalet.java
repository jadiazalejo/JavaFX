/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

public class Chalet extends Inmueble {

    private boolean jardin;
    private boolean piscina;
    private boolean ascensor;

    public Chalet(boolean jardin, boolean piscina, boolean ascensor, String numRegistro, String direccion, int numBanyos, int numDormi, String estado) {
        super(numRegistro, direccion, numBanyos, numDormi, estado);
        this.jardin = jardin;
        this.piscina = piscina;
        this.ascensor = ascensor;
    }

    @Override
    public String toString() {
        return "Chalet{" + "jardin=" + jardin + ", piscina=" + piscina + ", ascensor=" + ascensor + ", "
                + "numRegistro=" + getNumRegistro() + "direccion=" + getDireccion() + ""
                + "numero de Baños=" + getNumBanyos() + "numero de Dormitorios=" + getNumDormi() + ""
                + "Estado de la vivienda=" + getEstado() + '}';
    }

}