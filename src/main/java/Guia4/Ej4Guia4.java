/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej4Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        primo(num);
    }
    
    public static void primo(int n) {
        int cont=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                cont++;
            }
        }
        if (cont==2) {
            System.out.print("El numero ingresado es un numero primo");
        }else{
            System.out.print("El numero ingresado no es un numero primo");
        }
    }
    
}
