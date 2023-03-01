/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbanco;

/**
 *
 * @author adminroot
 */
public class CuentaAhorro extends CuentaBancaria {

    private static float saldoMinimo;

    public CuentaAhorro(String iban) {
        super(iban);
    }

    public static float getSaldoMinimo() {
        return saldoMinimo;
    }

    public static void setSaldoMinimo(float saldoMinimo) {
        CuentaAhorro.saldoMinimo = saldoMinimo;
    }

    @Override
    public float calcularIntereses() {
        float interes;
        if (super.getSaldo() < saldoMinimo) {
            interes = super.getSaldo() * (CuentaBancaria.getInteresAnualBasico() / 2);
        } else {
            interes = super.getSaldo() * (CuentaBancaria.getInteresAnualBasico() * 2);
        }

        return interes;
    }

    public float sumaIntereses() {

        super.setSaldo(super.getSaldo() + this.calcularIntereses());

        return super.getSaldo();
    }

    @Override
    public String muestraDatos() {
        return "Número de cuenta: " + super.getIban() + "\n\t"
                + "Saldo: " + super.getSaldo() + "\n\t"
                + "Interés básico anual: " + calcularIntereses() + "\n\t"
                + "Saldo mínimo: " + CuentaAhorro.getSaldoMinimo();
    }

}
