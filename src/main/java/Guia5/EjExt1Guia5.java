/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt1Guia5 {

    public static void main(String[] args) {
        int suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la longitud del vector");
        int N = sc.nextInt();
        int[] vec = new int[N];
        for (int i = 0; i < N; i++) {
            suma += sc.nextInt();
        }
    }
}
