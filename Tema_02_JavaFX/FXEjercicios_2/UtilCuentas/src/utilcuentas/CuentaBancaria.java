/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilcuentas;

/**
 *
 * @author adminroot
 */
public class CuentaBancaria {

    private static final float SALDO_MIN = -50;
    private static final float SALDO_MAX = 3000;

    private final String iban;
    private final String titular;
    private float saldo;
    private int cont = 0;
    private float movs[] = new float[100];

    public CuentaBancaria(String iban, String titular, float saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setMovs(float[] movs) {
        this.movs = movs;
    }

    public void ingreso(float cantidad) {

        if (cantidad <= 0) {
            System.out.println("\nERROR UN INGRESO NO DEBE SER CERO O NEGATIVO");
        } else {
            if (cantidad > SALDO_MAX) {
                System.out.println("\nAVISO: Notificar a Hacienda");
            }
            saldo += cantidad;
            movs[cont] = cantidad;
            if (cont == 99) {
                cont = 0;
            } else {
                cont++;
            }
        }

    }

    public void retirada(float cantidad) {

        if (cantidad >= 0) {
            System.out.println("\nERROR INTRODUCE EL VALOR NEGATIVO A RETIRAR");
        } else {
            if (saldo + cantidad < SALDO_MIN) {
                System.out.println("\nNO PUEDE RETIRARSE UN VALOR MENOR A -50");
            } else {
                saldo += cantidad;
                movs[cont] = cantidad;
                if (cont == 99) {
                    cont = 0;
                } else {
                    cont++;
                }
                if (saldo < 0 && saldo >= -50) {
                    System.out.println("\nAVISO SALDO NEGATIVO");
                }
            }

        }

    }

    public void getMovs() {
        for (float movimiento : movs) {
            if (movimiento != 0) {
                if (movimiento > 0) {
                    System.out.println("+" + movimiento);
                } else {
                    System.out.println(movimiento);
                }
            }
        }

    }

}
