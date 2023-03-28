/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia3;

import java.util.Scanner;

public class EjExt14Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M,cont=0,suma=0;
        System.out.print("Ingrese la cantidad de familias a censar: ");
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            System.out.println("Ingrese la cantidad de hijos de la "+(N+1)+"° familia ");
            M = sc.nextInt();
            for (int j=0;j<N;j++){
                System.out.println("Ingrese la edad del"+(N+1)+"° hijo de la "+(M+1)+"° familia ");
                suma+=sc.nextByte();
                cont++;
            }
        }
        System.out.print("La media de la edad de los hijos de todas las familias censadas es "+(suma/cont));
    }
}
