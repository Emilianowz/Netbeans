package Guia2;

import java.util.Scanner;

public class Ej1Guia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numUno = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numDos = leer.nextInt();
        int suma = numUno+numDos;
        System.out.print("La suma de los 2 numeros ingresados es " + suma);
    }
    
}
