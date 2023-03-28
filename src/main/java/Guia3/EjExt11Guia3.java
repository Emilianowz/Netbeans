/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia3;

import java.util.Scanner;

public class EjExt11Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int cont=0;
        while (num>0){
            num/=10;
            cont++;
        }
        System.out.print("\nCantidad de digitos del numero ingresado: "+cont);
    }
}
