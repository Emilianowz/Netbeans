/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

public class Ej1Guia5 {

    public static void main(String[] args) {
        int [] vec = new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i]=i+1;
        }
        for (int j = 99; j >= 0; j--) {   
            System.out.print(vec[j]+",");           
        }
    }
}
