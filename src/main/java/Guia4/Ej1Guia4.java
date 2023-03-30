/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej1Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("MENU\n\n1_ Sumar\n2_ Restar\n3_ Multiplicar\n4_ Dividir\n\nElija una opcion: ");
        int op = sc.nextInt();
        switch(op){
            case 1: System.out.println("\nEl resultado de la suma es "+sumar(num1,num2));
                break;
            case 2: System.out.println("\nEl resultado de la resta es "+restar(num1,num2));
                break;
            case 3: System.out.println("\nEl resultado de la multiplicacion es "+multiplicar(num1,num2));
                break;
            case 4: System.out.println("\nEl resultado de la division es "+dividir(num1,num2));
                break;
        }
    }
    
    public static int sumar(int n1,int n2){
    return n1+n2;
    }
    
    public static int restar(int n1,int n2){
    return n1-n2;
    }
    
    public static int multiplicar(int n1,int n2){
    return n1*n2;
    }
    
    public static float dividir(int n1,int n2){
    return n1/n2;
    }
}
