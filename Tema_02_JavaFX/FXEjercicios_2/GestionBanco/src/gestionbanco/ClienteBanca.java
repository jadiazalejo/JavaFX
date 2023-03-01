/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbanco;

import java.util.ArrayList;
import java.util.Iterator;

public class ClienteBanca {

    private String nombre;
    private final String dni;
    private ArrayList<CuentaBancaria> misCuentas = new ArrayList();

    public ClienteBanca(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void muestraCuentas() {
        Iterator it = misCuentas.iterator();
        CuentaBancaria c;
        while (it.hasNext()) {
            c = (CuentaBancaria) it.next();
            System.out.println(c.muestraDatos());
        }
    }

    public void addCuenta(CuentaBancaria c) {
        misCuentas.add(c);
    }

    public boolean obtCuenta(String iban) {
        boolean match = false;
        Iterator it = misCuentas.iterator();
        CuentaBancaria c;
        while (it.hasNext() && match == false) {
            c = (CuentaBancaria) it.next();
            if (iban.equals(c.getIban())) {
                match = true;
            }
            System.out.println(c.muestraDatos());
        }
        return match;
    }
    
    public CuentaBancaria devCuenta(String iban) {
        boolean match = false;
        Iterator it = misCuentas.iterator();
        CuentaBancaria c=null;
        while (it.hasNext() && match == false) {
            c = (CuentaBancaria) it.next();
            if (iban.equals(c.getIban())) {
                match = true;
            }
        }
        return c;
    }

    public boolean cerrarCuenta(String iban) {
        boolean match = false;
        Iterator it = misCuentas.iterator();
        CuentaBancaria c;
        while (it.hasNext() && match == false) {
            c = (CuentaBancaria) it.next();
            if (iban.equals(c.getIban())) {
                match = true;
                misCuentas.remove(c);
            }
        }
        return match;
    }

    public boolean ingresa(String iban, float euros) {
        boolean match = false;
        Iterator it = misCuentas.iterator();
        CuentaBancaria c;
        while (it.hasNext() && match == false) {
            c = (CuentaBancaria) it.next();
            if (iban.equals(c.getIban())) {
                match = true;
                c.ingresar(euros);
            }
        }
        return match;
    }

    public boolean carga(String iban, float euros) {
        int n;
        boolean match = false;
        Iterator it = misCuentas.iterator();
        CuentaBancaria c;
        while (it.hasNext() && match == false) {
            c = (CuentaBancaria) it.next();
            if (iban.equals(c.getIban())) {
                match = true;
                n = misCuentas.indexOf(c);
                misCuentas.get(n).retirar(euros);
            }
        }
        return match;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "ClienteBanca{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}
