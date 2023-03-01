/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilcuentas;

import java.util.Scanner;

/**
 *
 * @author adminroot
 */
public class UtilCuentas {

    public static void main(String[] args) {
        int menu;
        float cantidad;
        String nom, iban;
        CuentaBancaria cuenta;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un nombre para el titular de la cuenta");
        nom=sc.nextLine();
        iban=entradaRegex("[A-Za-z]{2}[0-9]{22}", "Introduce un IBAN (2 letras y 22 digitos)");
        
        cuenta=new CuentaBancaria(iban,nom,0);
        
        do {
         
            menu=entradaInt(1,8,"\nElige una opción del menu:"
                    + "\n1- DATOS DE LA CUENTA"
                    + "\n2-IBAN"
                    + "\n3-TITULAR"
                    + "\n4-SALDO"
                    + "\n5-INGRESO"
                    + "\n6-RETIRADA"
                    + "\n7-MOVIMIENTOS"
                    + "\n8-SALIR");
            
            switch (menu) {
                
                case 1:
                    System.out.println(cuenta.toString());
                    
                    break;
              
                case 2:
                    System.out.println("IBAN: " +cuenta.getIban());
                    
                    break;
              
                case 3:
                    System.out.println("TITULAR: " +cuenta.getTitular());
                    
                    break;
              
                case 4:
                    System.out.println("SALDO: " +cuenta.getSaldo());
                    
                    break;
              
                case 5:
                    System.out.println("Introduce una cantidad a ingresar: ");
                    cantidad=sc.nextFloat();
                    cuenta.ingreso(cantidad);
                    
                    break;
              
                case 6:
                    System.out.println("Introduce una cantidad a retirar (en negativo): ");
                    cantidad=sc.nextFloat();
                    cuenta.retirada(cantidad);
                    break;
              
                case 7:
                    cuenta.getMovs();
                    break;
              
                case 8:
                    System.out.println("\nFINALIZAR PROGRAMA");
                    
                    break;
             
              
            }
            
        } while (menu!=8);
        
        
        
    }
    
     public static int entradaInt(int min, int max, String mensaje) {
        Scanner sc = new Scanner(System.in);
        int salida = 0;
        boolean correcto = true;
         do {
             System.out.println(mensaje);
             if (sc.hasNextInt()) {
                salida = sc.nextInt();
                if (salida < min || salida > max) {
                    correcto = false;
                } else {
                    correcto = true;
                }
            } else {
                sc.nextLine();
                correcto = false;
            }
            if (!correcto) {
                System.out.println("Debes introducir un número entero entre"
                        + " el " + min + " y el " + max + ".");
            }
        } while (!correcto);
        return salida;
    }


    
    public static String entradaRegex(String regex, String mensaje) {

        Scanner scw = new Scanner(System.in);
        String input;
        boolean correcto = false;
        do {
            System.out.println(mensaje);
            input = scw.nextLine();
            if (input.matches(regex)) {
                correcto = true;
            }
            if (!correcto) {
                System.out.println("Entrada no compatible con " + regex);

            }
        } while (!correcto);
        return input;

    }
}
