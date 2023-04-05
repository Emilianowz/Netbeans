/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt2Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        System.out.println("Indique el tamaño del vector: ");
        int N = sc.nextInt();
        int [] vec1 = new int [N];
        int [] vec2 = new int [N];
        for (int i = 0; i < N; i++) {
            vec1[i]=(int) (Math.random()*9)+1;
            vec2[i]=(int) (Math.random()*9)+1;
        }
        for (int i = 0; i < 10; i++) {
            if (vec1[i]==vec2[i]) {
                cont++;
            } else {
                break;
            }
        }
        if (cont==N) {
            System.out.println("Los 2 vectores creados son iguales");
        }else{
            System.out.println("Los 2 vectores creados son distintos");
        }
    }
}
