/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt6Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posIni=0,posFin=0,subs=0;
        String palabra="";
        String [][] sopa = new String[20][20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese una palabra de longitud de 3 a 5 caracteres: ");
            do {
                palabra=sc.next().toUpperCase();
                if (palabra.length()<3 || palabra.length()>5) {
                    System.out.println("Incorrecto, ingrese nuevamente la palabra");
                }
            } while (palabra.length()<3 || palabra.length()>5);
            switch (palabra.length()){
                case 3 -> {
                    posIni=(int) (Math.random()*16);
                    posFin=posIni+2;
                    break;
                }
                case 4 -> {
                    posIni=(int) (Math.random()*15);
                    posFin=posIni+3;
                    break;
                }
                case 5 -> {
                    posIni=(int) (Math.random()*14);
                    posFin=posIni+4;
                    break;
                }
            }
            for (int j = 0; j < 20; j++) {
                if (j>=posIni && j<=posFin) {
                    sopa[i][j]=palabra.substring(subs,subs+1);
                    if (subs<=posFin-posIni) {
                        subs++;
                    }
                } else {
                    sopa[i][j]= String.valueOf((int) (Math.random()*9));
                }
            }
            palabra="";
            subs=0;
        }   
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
