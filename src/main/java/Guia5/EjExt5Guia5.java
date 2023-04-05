/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt5Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        System.out.println("Indique la cantidad de filas de la matriz a generar: ");
        int N = sc.nextInt();
        System.out.println("Indique la cantidad de columnas de la matriz a generar: ");
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j]=(int) (Math.random()*9)+1;
                suma+=matrix[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
    }
}
