/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Clientes.Cliente;
import java.util.Date;

/**
 *
 * @author adminroot
 */
public class Free extends Cliente {


    private Date fecha_revision;
    private int tiempo_publicidad;

    public Free(Date fecha_revision, int tiempo_publicidad, String userName, String password, String email) {
        super(userName, password, email);
        this.fecha_revision = fecha_revision;
        this.tiempo_publicidad = tiempo_publicidad;
    }
    
    public Date getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(Date fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public int getTiempo_publicidad() {
        return tiempo_publicidad;
    }

    public void setTiempo_publicidad(int tiempo_publicidad) {
        this.tiempo_publicidad = tiempo_publicidad;
    }
    
    @Override
    public String muestraDatos() {
        String salida = "";
        salida = "Id :" + super.getId() + "\n";
        salida += "UswrName :" + super.getUserName() + "\n";
        salida += "Email :" + super.getEmail() + "\n";
        salida += "Fecha de Revisión :"+getFecha_revision()+"\n";
        salida += "Tiempo de publicidad :"+getTiempo_publicidad()+" minutos\n";
        
        return salida;
    }

}
