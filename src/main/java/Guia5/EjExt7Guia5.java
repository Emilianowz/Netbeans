/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt7Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=1,pos1=0,pos2=1,acum;
        System.out.println("Ingresar un numero: ");
        int n = sc.nextInt();
        System.out.println("La sucesion de Fibonacci de los "+n+" primeros numeros es: ");
        System.out.print(pos1);
        while (cont<=n) {
            System.out.print(","+pos2);
            acum=pos2;
            pos2+=pos1;
            pos1=acum;
            cont++;
        }
    }
}
