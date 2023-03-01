/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbanco;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban) {
        super(iban);
    }

    @Override
    public float calcularIntereses() {
        float interes;
        interes = super.getSaldo() * (CuentaCorriente.getInteresAnualBasico());

        return interes;
    }

    public float sumaIntereses() {
        this.setSaldo(this.getSaldo() + this.calcularIntereses());

        return this.getSaldo();
    }

    @Override
    public String muestraDatos() {
        return "Número de cuenta: " + super.getIban() + "\n\t"
                + "Saldo: " + super.getSaldo() + "\n\t"
                + "Interés básico anual: " + CuentaCorriente.getInteresAnualBasico();
    }

}
