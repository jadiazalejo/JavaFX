/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaempleados;

import java.util.Scanner;

/**
 *
 * @author adminroot
 */
public class EmpresaEmpleados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradast = new Scanner(System.in);
        String dni, nom;
        float sumaB, sumaN, sue;
        Empresa trad = new Empresa("Trading", "B456545");

        trad.addEmpleado(new Empleado("Pepe", "45632189Z", 2000, 30, "656545632", "Su Casa"));
        trad.addEmpleado(new Empleado("Lola", "96523145Z", 3000, 25, "759648526", "Su Casa"));
        trad.addEmpleado(new Empleado("Luis", "65231458V", 800, 18, "852365897", "Su Casa"));
        trad.addEmpleado(new Empleado("Federico", "12356985F", 1000, 18, "65589548", "Su Casa"));
        trad.addEmpleado(new Empleado("Andrea", "65236587R", 2500, 45, "758945784", "Su Casa"));
        trad.addEmpleado(new Empleado("Lydia", "65423598L", 1500, 20, "854891232", "Su Casa"));

        trad.muestraEmpleados();//muestra toda la info de todos los empleados

        do {
            System.out.println("Introduce el dni del empleado a despedir");
            dni = entradast.nextLine();
            if (Lib.compruebaDni(dni) == true) {
                if (trad.buscaEmpleado(dni) == true) {
                    trad.rmvEmpleado(dni);
                    trad.muestraEmpleados();
                } else {
                    System.out.println("El empleado no existe");
                }
            }
        } while (Lib.compruebaDni(dni) == false || trad.buscaEmpleado(dni) == false);

        do {
            System.out.println("Introduce los datos básicos del nuevo empleado");
            System.out.println("Introduce su DNI");
            dni = entradast.nextLine();
            if (Lib.compruebaDni(dni) == true) {
                System.out.println("Introduce su nombre");
                nom = entradast.nextLine();

                System.out.println("Introduce su salario bruto mensual");
                sue = entrada.nextFloat();

                trad.addEmpleado(new Empleado(nom, dni, sue));
            } else {
                System.out.println("Formato incorrecto");
            }
        } while (Lib.compruebaDni(dni) == false);

        trad.infoBas(); //DNI, sueldo bruto y sueldo neto

        sumaB = trad.sumaBrutos();
        System.out.println("Suma total de los sueldos brutos de todos los empleados: " + sumaB);

        sumaN = trad.sumaNetos();
        System.out.println("Suma total de los sueldos netos de todos los empleados: " + sumaN);

    }
    
}
