/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej2TeoriaGuia4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int n1, int n2) {

        if(n1 % n2 == 0){
            System.out.println("El número " + n1 + " es múltiplo de " + n2);
        }else{
            System.out.println("El número " + n1 + " no es múltiplo de " + n2);
        }
    }
    
}
