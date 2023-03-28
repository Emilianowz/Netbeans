package Guia3;

import java.util.Scanner;

public class Ej5Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Ingrese un valor limite positivo: ");
        int lim = sc.nextInt();
        int suma=0;
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        do {
            suma+=num;
            System.out.print("Ingrese un numero: ");
        } while(suma<=lim);
        System.out.print("Se ha superado el limite indicado");
    }
    
}
