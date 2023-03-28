package Guia2;

import java.util.Scanner;

public class Ej4Guia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados celcius: ");
        int temp = leer.nextInt();
        int faren = 32 + (9 * temp / 5);
        System.out.print("El equivalente de la temp ingresada en °F es: " + faren );
    }
    
}
