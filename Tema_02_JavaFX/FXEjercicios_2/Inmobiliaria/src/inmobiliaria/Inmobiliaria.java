/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmobiliaria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inmobiliaria {

    public static void main(String[] args) {
        String busca;
        Scanner scw = new Scanner(System.in);
        int cont;
        boolean match;
        ArrayList<Inmueble> inmuebleList = new ArrayList();
        Iterator iter;
        Inmueble in;

        inmuebleList.add(new Chalet(true, true, false, "4567", "C/delasRosas,21", 2, 3, "buen estado"));
        inmuebleList.add(new Chalet(true, false, false, "1783", "C/Montoya,41", 1, 2, "a reformar"));
        inmuebleList.add(new Estudio(true, "7853", "Av. Santa Maria,13", 1, 0, "buen estado"));
        inmuebleList.add(new Estudio(false, "4740", "C/Alforins, 124", 1, 0, "buen estado"));
        inmuebleList.add(new Estudio(true, "0274", "C/Llorer, 34", 1, 0, "buen estado"));
        inmuebleList.add(new Piso(4, true, 14, true, "5678", "C/San Fernado,12", 2, 3, "a reformar"));
        inmuebleList.add(new Piso(1, false, 0, false, "0029", "C/Gil Justo,15", 1, 2, "buen estado"));
        inmuebleList.add(new Atico(7, true, 20, true, true, "9878", "Paseo Alondras,12", 2, 3, "nuevo"));
        inmuebleList.add(new Atico(12, true, 15, true, false, "4670", "C/Ernesto Orcea,2", 1, 2, "buen estado"));
        inmuebleList.add(new Atico(11, true, 13, true, false, "1124", "C/Manises,50", 2, 3, "a reformar"));

        System.out.println("Introduce un codigo del inmueble para mostrar su informacion: ");
        busca = scw.nextLine();

        match = false;
        cont = 0;
        while (cont < inmuebleList.size() && !match) {
            if (inmuebleList.get(cont).getNumRegistro().equals(busca)) {
                System.out.println(inmuebleList.get(cont).toString());
                match = true;
            }
            cont++;
        }
        if (match == false) {
            System.out.println("No encontrado");
        }

        iter = inmuebleList.iterator();
        match = false;
        while (iter.hasNext() && match == false) {
            in = (Inmueble) iter.next();
            if (in.getNumRegistro().equals(busca)) {
                System.out.println(in.toString());
                match = true;
            }
        }
        if (match == false) {
            System.out.println("No encontrado");
        }
    }
}
