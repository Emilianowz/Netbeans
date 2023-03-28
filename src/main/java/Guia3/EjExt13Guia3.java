/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia3;

import java.util.Scanner;

public class EjExt13Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera de numeros: ");
        int cont=0,alt=sc.nextInt();
        for (int i=0;i<alt;i++){
            while (cont<=i){
                cont++;
                System.out.print(cont);
            }
            System.out.print("\n");
            cont=0;
        }
    }
}
