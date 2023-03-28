package Guia3;

import java.util.Scanner;

public class Ej4Guia3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        
        if ( "A".equalsIgnoreCase(frase.substring(0,1))){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        if ( frase.startsWith("A") || frase.startsWith("a") ){
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
    }
}
