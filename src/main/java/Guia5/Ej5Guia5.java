/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class Ej5Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        System.out.println("Ingrese el orden de la matriz cuadrada: ");
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*9+1);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==matrix[j][i]) {
                    cont++;
                }
            }
            System.out.println("");
        }
        if (cont==n*n) {
            System.out.println("La matriz generada es una matriz AT");
        } else {
            System.out.println("La matriz generada no es una matriz AT");
        }
    }
}
