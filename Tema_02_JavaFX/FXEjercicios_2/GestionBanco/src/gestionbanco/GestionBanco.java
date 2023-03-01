/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adminroot
 */
public class GestionBanco {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner para int
        Scanner entradast = new Scanner(System.in); // Scanner para String
        ArrayList<ClienteBanca> clientes = new ArrayList();
        int resp, n;
        String nom, dni, iban;
        float interes;

        do {
            System.out.println("Elige lo que quieres hacer:\n\n"
                    + "1. Crear un cliente\n"
                    + "2. Abrir una cuenta corriente\n"
                    + "3. Abrir una cuenta de ahorro\n"
                    + "4. Listar clientes\n"
                    + "5. Listar cuentas de un cliente\n"
                    + "6. Listar todas las cuentas bancarias\n"
                    + "7. Modificar el porcentaje de intereses\n"
                    + "8. Cerrar cuenta\n"
                    + "9. Salir\n");
            resp = entrada.nextInt();
            if (resp < 0 || resp > 9) {
                System.out.println("Opción inexistente");
            }
            switch (resp) {
                case 1:
                    System.out.println("Introduce el nombre del cliente");
                    nom = entradast.nextLine();
                    do {
                        System.out.println("Introduce el DNI del cliente");
                        dni = entradast.nextLine();
                        if (Lib.compruebaDni(dni) == true) {
                            clientes.add(new ClienteBanca(nom, dni));
                        } else {
                            System.out.println("Formato de DNI incorrecto");
                        }
                    } while (Lib.compruebaDni(dni) == false);

                    break;
                case 2:
                    do {
                        System.out.println("Introduce el número de cuenta");
                        iban = entradast.nextLine();
                        if (Lib.compruebaIban(iban) == true) {
                            do {
                                System.out.println("Introduce el DNI del titular");
                                dni = entradast.nextLine();
                                if (Lib.compruebaDni(dni) == true) {
                                    if (buscaCliente(dni, clientes) == true) {
                                        n = bCliente(dni, clientes);
                                        clientes.get(n).addCuenta(new CuentaCorriente(iban));
                                        clientes.get(n).muestraCuentas();
                                    }
                                } else {
                                    System.out.println("Formato de DNI incorrecto");
                                }
                            } while (Lib.compruebaDni(dni) == false || buscaCliente(dni, clientes) == false);
                        }
                    } while (Lib.compruebaIban(iban) == false);
                    break;
                case 3:
                    do {
                        System.out.println("Introduce el número de cuenta");
                        iban = entradast.nextLine();
                        if (Lib.compruebaIban(iban) == true) {
                            do {
                                System.out.println("Introduce el DNI del titular");
                                dni = entradast.nextLine();
                                if (Lib.compruebaDni(dni) == true) {
                                    if (buscaCliente(dni, clientes) == true) {
                                        n = bCliente(dni, clientes);
                                        clientes.get(n).addCuenta(new CuentaAhorro(iban));
                                        clientes.get(n).muestraCuentas();
                                    }
                                } else {
                                    System.out.println("Formato de DNI incorrecto");
                                }
                            } while (Lib.compruebaDni(dni) == false || buscaCliente(dni, clientes) == false);
                        } else {
                            System.out.println("Formato de Iban incorrecto");
                        }
                    } while (Lib.compruebaIban(iban) == false);
                    break;
                case 4:
                    System.out.println("Éstos son los datos de los clientes: ");
                    muestraClientes(clientes);
                    break;
                case 5:
                    do {
                        System.out.println("Introduce el DNI del titular");
                        dni = entradast.nextLine();
                        if (Lib.compruebaDni(dni) == true) {
                            if (buscaCliente(dni, clientes) == true) {
                                n = bCliente(dni, clientes);
                                clientes.get(n).muestraCuentas();
                            }
                        } else {
                            System.out.println("Formato de DNI incorrecto");
                        }
                    } while (Lib.compruebaDni(dni) == false || buscaCliente(dni, clientes) == false);
                    break;
                case 6:
                    System.out.println("Éstas son todas las cuentas del banco: ");
                    for (int i = 0; i < clientes.size(); i++) {
                        clientes.get(i).muestraCuentas();
                    }
                    break;
                case 7:
                    do {
                        System.out.println("Introduce el nuevo interés en formato n,nn");
                        interes = entrada.nextFloat();
                        if (interes > 0.0 && interes < 1.0) {
                            CuentaBancaria.setInteresAnualBasico(interes);
                            System.out.println("Nuevo interés: " + CuentaBancaria.getInteresAnualBasico());
                        } else {
                            System.out.println("Formato incorrecto");
                        }
                    } while (interes < 0.0 || interes > 1.0);
                    break;
                case 8:
                    do {
                        System.out.println("Introduce el DNI del titular");
                        dni = entradast.nextLine();
                        if (Lib.compruebaDni(dni) == true) {
                            if (buscaCliente(dni, clientes) == true) {
                                n = bCliente(dni, clientes);
                                clientes.get(n).muestraCuentas();
                                System.out.println("Introduce el número de cuenta que quieres cerrar");
                                iban = entradast.nextLine();
                                if (Lib.compruebaIban(iban) == true) {
                                    if (clientes.get(n).cerrarCuenta(iban) == false) {
                                        System.out.println("El cliente no tiene esa cuenta");
                                    }
                                    clientes.get(n).cerrarCuenta(iban);

                                    clientes.get(n).muestraCuentas();
                                } else {
                                    System.out.println("Formato de Iban incorrecto");
                                }
                            }
                        } else {
                            System.out.println("Formato de DNI incorrecto");
                        }
                    } while (Lib.compruebaDni(dni) == false || buscaCliente(dni, clientes) == false);
                    break;
                case 9:

                    System.out.println("Saliendo!");
                    break;
            }
        } while (resp != 9);

        
        //pruebas
        CuentaCorriente cuenta1 = new CuentaCorriente("ES5231232145632569874562");

        cuenta1.ingresar(1000);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        System.out.println("Interés: " + cuenta1.calcularIntereses());

        cuenta1.sumaIntereses();

        System.out.println("Saldo actual: " + cuenta1.getSaldo());

    }

    public static boolean buscaCliente(String dni, ArrayList clientes) {
        boolean match = false;
        Iterator it = clientes.iterator();
        ClienteBanca c;
        while (it.hasNext() && match == false) {
            c = (ClienteBanca) it.next();
            if (dni.equals(c.getDni())) {
                match = true;
            }
        }
        return match;
    }

    public static void mCliente(String dni, ArrayList clientes) {
        int n;
        boolean match = false;
        Iterator it = clientes.iterator();
        ClienteBanca c;
        while (it.hasNext() && buscaCliente(dni, clientes) == true) {
            c = (ClienteBanca) it.next();
            if (dni.equals(c.getDni())) {
                match = true;
                n = clientes.indexOf(c);
                clientes.get(n).toString();
            }
        }

    }

    public static void muestraClientes(ArrayList clientes) {
        Iterator it = clientes.iterator();
        ClienteBanca c;
        while (it.hasNext()) {
            c = (ClienteBanca) it.next();
            System.out.println(c.toString());
        }
    }

    public static int bCliente(String dni, ArrayList clientes) {
        int n = -1;
        boolean match = false;
        Iterator it = clientes.iterator();
        ClienteBanca c;
        while (it.hasNext() && match == false) {
            c = (ClienteBanca) it.next();
            if (dni.equals(c.getDni())) {
                match = true;
                n = clientes.indexOf(c);
            }
        }
        return n;
    }
    
}
