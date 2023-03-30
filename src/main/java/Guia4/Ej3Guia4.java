/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej3Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        int euro = sc.nextInt();
        System.out.println("Indique a que tipo de divisa desea convertir los euros: ");
        System.out.println("1_ Dolar\n2_ Yenes\n3_ Libras");
        int op = sc.nextInt();
        convertir(euro,op);        
    }
    
    public static void convertir(int euro,int op){
        switch(op){
            case 1: System.out.print("Sus "+euro+" euros equivalen a "+(euro*1.28611)+" dolares");
                break;
            case 2: System.out.print("Sus "+euro+" euros equivalen a "+(euro*129.852)+" yenes");
                break;
            case 3: System.out.print("Sus "+euro+" euros equivalen a "+(euro*0.86)+" libras");
                break;
        }
    }
}
