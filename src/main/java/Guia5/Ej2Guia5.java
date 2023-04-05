/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Random;
import java.util.Scanner;

public class Ej2Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el tamaño del vector: ");
        int N = sc.nextInt();
        int [] vec = new int[N];
        System.out.println("Ingrese el numero que desea buscar dentro del vector: ");
        int numBus = sc.nextInt(),cont=0;
        for (int i = 0; i < N; i++) {
            vec[i] = (int) (Math.random()*6+1);
            if (vec[i]==numBus){
                cont++;
                if (cont==1){
                    System.out.print("El numero buscado se encuentra en la/s posicion/es "+i);
                }else if (cont>1){
                    System.out.print(","+i);
                }
            }
        }
        if (cont==0) {
            System.out.println("El numero buscado no se encuentra dentro del vector");
        }
    }
}
