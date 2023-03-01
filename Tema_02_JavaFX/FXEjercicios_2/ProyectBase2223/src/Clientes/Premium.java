package Clientes;

import Clientes.Cliente;
import java.util.Date;
import Suscripcion.Suscripcion;

public class Premium extends Cliente{
    private Date fecha_nacimiento;
    private String genero;
    private String pais;
    private String codigo_postal;
    private String fecha_renovación;
    private Suscripcion suscripcion;

    public Premium(String userName, String password, String email, 
            Date fecha_nacimiento, String genero, String pais, 
            String codigo_postal, String fecha_renovacion, 
            Suscripcion suscripcion){
        super(userName, password, email);
        this.fecha_nacimiento=fecha_nacimiento;
        this.genero=genero;
        this.pais=pais;
        this.codigo_postal=codigo_postal;
        this.fecha_renovación=fecha_renovacion;
        this.suscripcion=suscripcion;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    public void setFecha_renovación(String fecha_renovación) {
        this.fecha_renovación = fecha_renovación;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getGenero() {
        return genero;
    }
    public String getPais() {
        return pais;
    }
    public String getCodigo_postal() {
        return codigo_postal;
    }
    public String getFecha_renovación() {
        return fecha_renovación;
    }
    public Suscripcion getSuscripcion() {
        return suscripcion;
    }
    public String muestraDatos(){
        return "Datos del cliente "+ super.getId()+ "\n\t" +
                "Nombre de usuario: "+super.getUserName() + "\n\t"+
                "e-mail: "+super.getEmail() + "\n\t"+
                "Fecha de nacimiento: "+ this.fecha_nacimiento+"\n\t"+
                "Genero: "+this.genero+"\n\t"+
                "Pais: "+this.pais+"\n\t"+
                "Codigo postal: "+this.codigo_postal+"\n\t"+
                "Fecha de renovación: "+this.fecha_renovación;
    }
}