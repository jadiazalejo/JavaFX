package Modelo;

public class Empleado {

    //Atributos miembro
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private int edad;
    private String dpto;
    private boolean estado; //Fijo o eventual
    private float sueldo_bruto;


    public Empleado(String nombre, String dni, String direccion,
            String telefono, String dpto, boolean estado,
            float sueldo_bruto, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dpto = dpto;
        this.estado = estado;
        this.sueldo_bruto = sueldo_bruto;
        this.edad = edad;
    }

    public Empleado() {
        nombre = "";
        dni="";
    }

    public void setNombre(String n) {
        nombre = n;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }

    public float getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //método
    public void muestraInfo() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("SUELDO BRUTO: " + sueldo_bruto);

    }
    
     @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + ", dpto=" + dpto + ", estado=" + estado + ", sueldo_bruto=" + sueldo_bruto + '}';
    }

    public float calculaSalarioNeto() {
        float neto, anual_bruto;
        anual_bruto = sueldo_bruto * 12;
        if (anual_bruto < 12000) {
            neto = anual_bruto - (anual_bruto * 0.2f);
        }
        if (anual_bruto >= 12000 && anual_bruto < 25000) {
            neto = anual_bruto - (anual_bruto * 0.3f);
        } else {
            neto = anual_bruto - (anual_bruto * 0.4f);
        }
        return neto;
    }

}