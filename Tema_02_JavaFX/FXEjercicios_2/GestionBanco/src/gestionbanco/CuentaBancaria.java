/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbanco;

/**
 *
 * @author adminroot
 */
public abstract class  CuentaBancaria {
    private final String iban;
    private float saldo;
    private static float interesAnualBasico = (float) 0.10;

    public abstract float calcularIntereses();

    public abstract String muestraDatos();

    public CuentaBancaria(String iban) {
        this.iban = iban;
    }

    public void ingresar(float euros) { //ingresos en cuenta

        saldo = saldo + euros;
    }

    public void retirar(float euros) { //cantidad en negativo

        saldo = saldo - euros;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static float getInteresAnualBasico() {
        return interesAnualBasico;
    }

    public static void setInteresAnualBasico(float interesAnualBasico) {
        CuentaBancaria.interesAnualBasico = interesAnualBasico;
    }

    public String getIban() {
        return iban;
    }

    
}
