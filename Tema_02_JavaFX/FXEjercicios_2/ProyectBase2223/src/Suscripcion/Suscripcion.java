/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suscripcion;

import Pago.Pago;
import java.util.ArrayList;
import java.util.Date;

public class Suscripcion {

    private int id;
    private Date fecha_inicio;
    private Date fecha_fin;
    private ArrayList <Pago> pagos;

    public Suscripcion(int id, Date fecha_inicio, Date fecha_fin) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.pagos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public boolean addPago(Pago pago) {
        boolean done;
        done = this.pagos.add(pago);
        return done;
    }

    public void pagosToString() {
        for (int i = 0; i < pagos.size(); i++) {
            System.out.println(pagos.get(i).muetraPago());
        }
    }
}
