/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

public class aasafasf {

    
    public static void main(String[] args) {
        int num,cont=0;
        int[] vec = new int [5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                num=(int) ((Math.random()*9)+1);
                while (num!=vec[j]){
                    if (cont==i && i<4) {
                        vec[i+1]=num;
                    }
                    cont++;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println(vec[i]+" ");
        }
    }
}
