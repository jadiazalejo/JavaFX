/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pago;

import java.util.Date;

/**
 *
 * @author adminroot
 */
public abstract class Pago {
    private int id;
    private Date fechaPago;
    private float cantidad;
    
    
    public abstract String muetraPago();
    
}
