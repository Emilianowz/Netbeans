/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

public class Ej4Guia5 {

    public static void main(String[] args) {
        int [][] matrix = new int[4][4];
        System.out.println("Matriz Original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j]=(int) (Math.random()*9+1);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz Traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
