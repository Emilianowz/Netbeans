/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

import java.util.Scanner;

public class EjExt4Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prom=0,cont=0;
        int notas[][] = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0 -> {
                        System.out.println("Ingrese la nota del primer TP evaluativo del " + (i + 1) + "° alumno: ");
                        notas[i][j]=sc.nextInt();
                        prom+=(notas[i][j])*0.1;
                        break;
                    }
                    case 1 -> {
                        System.out.println("Ingrese la nota del segundo TP evaluativo del " + (i + 1) + "° alumno: ");
                        notas[i][j]=sc.nextInt();
                        prom+=(notas[i][j])*0.15;
                        break;
                    }
                    case 2 -> {
                        System.out.println("Ingrese la nota del primer integerador del " + (i + 1) + "° alumno: ");
                        notas[i][j]=sc.nextInt();
                        prom+=(notas[i][j])*0.25;
                        break;
                    }
                    case 3 -> {
                        System.out.println("Ingrese la nota del Primer segundo del " + (i + 1) + "° alumno: ");
                        notas[i][j]=sc.nextInt();
                        prom+=(notas[i][j])*0.5;
                        break;
                    }
                }
            }
            notas[i][4]=prom;
            prom=0;
            if (notas[i][4]>=7) {
                cont++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: "+cont);
        System.out.println("La cantidad de alumnos no aprobados es: "+(Math.abs(10-cont)));
    }
    
}
