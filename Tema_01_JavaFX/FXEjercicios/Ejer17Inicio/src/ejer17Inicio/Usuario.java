/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer17Inicio;

/**
 *
 * @author adminroot
 */
public class Usuario implements java.io.Serializable{
    protected String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    protected String pwd;
    public Usuario(String u, String p) {
             usuario = u;
             pwd = p;
    }
    public void print() {
             System.out.println(usuario + " -> " + pwd);
    }

}
