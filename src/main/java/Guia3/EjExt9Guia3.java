package Guia3;

import java.util.Scanner;

public class EjExt9Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dvd=sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int dvs=sc.nextInt();
        int coc=0,res=dvd;
        while (res>dvs){
            res-=dvs;
            coc++;
        }
        System.out.print("El resultado de dividir "+dvd+" por "+dvs+" es "+coc);
    }

}
