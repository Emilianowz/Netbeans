/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej2Guia2 {

    public static void main(String[] args) {
        mostrar(); 
    }
    
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        String rta, nom;
        int edad;
        do {
            System.out.println("Ingrese nombre y apellido de la persona: ");
            nom = sc.nextLine();
            System.out.println("Ingrese edad de la persona: ");
            edad = sc.nextInt();
            if (edad < 18) {
                System.out.println("La persona de nombre "+ nom +" es menor de edad");
            } else {
                System.out.println("La persona de nombre "+ nom +" es mayor de edad");
            }
            System.out.println("¿Desea seguir mostrando personas? S/N");
            rta = sc.next();
            sc.nextLine();
        } while ("s".equalsIgnoreCase(rta));
    }
}
