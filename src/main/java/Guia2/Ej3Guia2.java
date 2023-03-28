package Guia2;

import java.util.Scanner;

public class Ej3Guia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        String min = frase.toLowerCase();
        String may = frase.toUpperCase();
        System.out.println(min);
        System.out.println(may);
    
    }
    
}
