package Guia3;

import java.util.Scanner;

public class Ej1Guia3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        if (num%2==0){
            System.out.print("El numero ingresado es un numero par");
        }
        else{
            System.out.print("El numero ingresado es un numero impar");
        }
    }
}
