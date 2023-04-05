/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

public class Ej3Guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el valor del tamaño del vector");
        int N = leer.nextInt();
        int vector[] = new int[N];
        int dig1, dig2, dig3, dig4, dig5;
        dig1=0; dig2=0; dig3=0; dig4=0; dig5=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10000 + 1 - 1) + 1;
            switch (String.valueOf(vector[i]).length()) {
                case 1: dig1++; break;
                case 2: dig2++; break;
                case 3: dig3++; break;
                case 4: dig4++; break;
                case 5: dig5++; break;
            }
        }
        System.out.println("En el vector hay : "  );
        System.out.println(dig1 +" numeros de 1 digito");
        System.out.println(dig2 +" numeros de 2 digito");
        System.out.println(dig3 +" numeros de 3 digito");
        System.out.println(dig4 +" numeros de 4 digito");
        System.out.println(dig5 +" numeros de 5 digito");
    }
}