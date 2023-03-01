/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaempleados;

public class Empleado {

    private final String nombre;
    private final String dni;
    private float sueBruMens;
    private int edad;
    private String tlf;
    private String direccion;

    public Empleado(String nombre, String dni, float sueBruMens, int edad, String tlf, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueBruMens = sueBruMens;
        this.edad = edad;
        this.tlf = tlf;
        this.direccion = direccion;
    }

    public Empleado(String nombre, String dni, float sueBruMens) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueBruMens = sueBruMens;
    }

    public float calculaNeto() { //devuelte el neto mensual
        float irpf, neto;
        float brutoAnual = sueBruMens * 12;

        if (brutoAnual < 12000) {
            irpf = (float) 0.8;
        } else if (brutoAnual >= 12000 && brutoAnual <= 25000) {
            irpf = (float) 0.7;
        } else {
            irpf = (float) 0.6;
        }
        neto = sueBruMens * irpf;

        return neto;

    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + getNombre() + ", dni=" + getDni() + ", sueBruMens=" + getSueBruMens() + ", edad=" + getEdad() + ", tlf=" + getTlf() + ", direccion=" + getDireccion() + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public float getSueBruMens() {
        return sueBruMens;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
