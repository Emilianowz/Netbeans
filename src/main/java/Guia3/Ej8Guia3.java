package Guia3;

import java.util.Scanner;

public class Ej8Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int i,j,num=sc.nextInt();
        for (i=0;i<num;i++){
            System.out.println();
            for (j=0;j<num;j++){
                if (i==0 || i==num-1){
                    System.out.print("* ");
                }else if (j==0 || j==num-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }

}
