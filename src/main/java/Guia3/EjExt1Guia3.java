package Guia3;

import java.util.Scanner;

public class EjExt1Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en minutos: ");
        int min = sc.nextInt();
        System.out.print("Los min ingresados corresponden a "+(min/(60*24))+" dia/s, y "+(min/60-(min/(60*24)*24))+" hora/s");
    }

}
