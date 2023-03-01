/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria;

public class Atico extends Inmueble {

    private int planta;
    private boolean terraza;
    private float supTerraza;
    private boolean ascensor;
    private boolean piscina;

    public Atico(int planta, boolean terraza, float supTerraza, boolean ascensor, boolean piscina, String numRegistro,
            String direccion, int numBanyos, int numDormi, String estado) {
        super(numRegistro, direccion, numBanyos, numDormi, estado);
        this.planta = planta;
        this.terraza = terraza;
        this.supTerraza = supTerraza;
        this.ascensor = ascensor;
        this.piscina = piscina;
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

    public boolean isPiscina() {
        return piscina;
    }

    @Override
    public String toString() {
        return "Atico{" + "planta=" + planta + ", terraza=" + terraza + ", supTerraza=" + supTerraza + ""
                + ", ascensor=" + ascensor + ", piscina=" + piscina + "numRegistro=" + getNumRegistro() + ""
                + ", direccion=" + getDireccion() + ", numBanyos=" + getNumBanyos() + ", numDormi=" + getNumDormi() + ", estado=" + getEstado() + '}';
    }

}