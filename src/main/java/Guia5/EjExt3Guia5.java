/*+
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt3Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el tamaño del vector: ");
        int N = sc.nextInt();
        int [] vec = new int [N];  
        rellenar(vec,N);
        mostrar(vec,N);
    }
    
    public static void rellenar(int v[],int n){ 
        for (int i = 0; i < n; i++) {
            v[i]=(int) (Math.random()*9)+1;
        }
    }
    
    public static void mostrar(int v[],int n) {
        System.out.println("El vector conformado es el siguiente:");
        for (int i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(v[i]+"]");
            } else if(i==0){
                System.out.print("["+v[i]+",");
            }else{
                System.out.print(v[i]+",");
            }
        }
    }
}
