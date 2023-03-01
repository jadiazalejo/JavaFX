/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaempleados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adminroot
 */
public class Empresa {

    private final String nombre;
    private final String cif;
    private String tlf;
    private String direccion;
    private ArrayList<Empleado> empleados = new ArrayList();

    public Empresa(String nombre, String cif) { //constructor con los atributos imprescindibles
        this.nombre = nombre;
        this.cif = cif;
    }

    public Empresa(String nombre, String cif, String tlf, String direccion) { //constructor con todos los datos
        this.nombre = nombre;
        this.cif = cif;
        this.tlf = tlf;
        this.direccion = direccion;
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public int buscaEmpleado(String dni) {
        int n = -1;
        boolean match = false;
        Iterator it = empleados.iterator();
        Empleado emp;
        while (it.hasNext() && match == false) {
            emp = (Empleado) it.next();
            if (dni.equals(emp.getDni())) {
                match = true;
                n = empleados.indexOf(emp);
            }
        }
        return n;
    }

    public Empleado devEmpleado(String dni) {
        boolean match = false;
        Iterator it = empleados.iterator();
        Empleado emp = null;
        while (it.hasNext() && match == false) {
            emp = (Empleado) it.next();
            if (dni.equals(emp.getDni())) {
                match = true;
            }
        }
        return emp;
    }

    public boolean rmvEmpleado(String dni) {
        int n;
        boolean done = false;
        n = buscaEmpleado(dni);
        if (n!= -1) {
                empleados.remove(n);
                done=true;
            }
        return done;
    }
    
    public boolean rmvEmpleado2(String dni) {
        Empleado e;
        boolean done = false;
        e = devEmpleado(dni);
        if (e!= null) {
                empleados.remove(e);
                done=true;
            }
        return done;
    }

    public void muestraEmpleados() {
        System.out.println("Éstos son los datos de los empleados: \n");
        Iterator it = empleados.iterator();
        Empleado emp;
        while (it.hasNext()) {
            emp = (Empleado) it.next();
            System.out.println(emp.toString());
        }
    }

    public void infoBas() {
        Iterator it = empleados.iterator();
        Empleado emp;
        while (it.hasNext()) {
            emp = (Empleado) it.next();
            System.out.println("DNI:" + emp.getDni());
            System.out.println("Sueldo bruto mensual: " + emp.getSueBruMens());
            System.out.println("Sueldo neto mensual: " + emp.calculaNeto());
        }
    }

    public float sumaBrutos() {
        float suma = 0;
        Iterator it = empleados.iterator();
        Empleado emp;
        while (it.hasNext()) {
            emp = (Empleado) it.next();
            suma = suma + (emp.getSueBruMens());
        }
        return suma;
    }

    public float sumaNetos() {
        float suma = 0;
        Iterator it = empleados.iterator();
        Empleado emp;
        while (it.hasNext()) {
            emp = (Empleado) it.next();
            suma = suma + (emp.calculaNeto());
        }
        return suma;
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
