/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

public class Piso extends Inmueble {

    private int planta;
    private boolean terraza;
    private float supTerraza;
    private boolean ascensor;

    public Piso(int planta, boolean terraza, float supTerraza, boolean ascensor, String numRegistro, String direccion, int numBanyos, int numDormi, String estado) {
        super(numRegistro, direccion, numBanyos, numDormi, estado);
        this.planta = planta;
        this.terraza = terraza;
        this.supTerraza = supTerraza;
        this.ascensor = ascensor;
    }

    public int getPlanta() {
        return planta;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public float getSupTerraza() {
        return supTerraza;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    @Override
    public String toString() {
        return "Piso{" + "planta=" + planta + ", terraza=" + terraza + ", "
                + "supTerraza=" + supTerraza + ", ascensor=" + ascensor + ""
                + "numRegistro=" + getNumRegistro() + ", direccion=" + getDireccion() + ", "
                + "numBanyos=" + getNumBanyos() + ", numDormi=" + getNumDormi() + ", estado=" + getEstado() + '}';
    }

}