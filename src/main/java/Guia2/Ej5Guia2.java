package Guia2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ej5Guia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.print("El doble del numero ingresado es: ");
        System.out.println(num*2);
        System.out.print("El triple del numero ingresado es: ");
        System.out.println(num*3);
        System.out.print("La raiz cuadrada del numero ingresado es: ");
        System.out.print(String.format("%.2f",sqrt(num)));
    }
    
}
