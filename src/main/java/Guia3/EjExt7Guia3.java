package Guia3;

import java.util.Scanner;

public class EjExt7Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,min,max=0,acum=0;
        System.out.print("Indique la cantidad de numeros positivos que va a ingresar: ");
        int N = sc.nextInt();
        System.out.println("Ingrese los "+N+" numeros:");
        int num=sc.nextInt();
        min=num;
        while (num<0){
            System.out.println("Ingrese nuevamente un numero positivo");
            num=sc.nextInt();
            min=num;    
         }
        while(i<N-1){
            num=sc.nextInt();
            while (num<0){
                System.out.println("Ingrese nuevamente un numero positivo");
                num=sc.nextInt();
            }
            if (num>max){
                max=num;
            }else if(num<min){
                min=num;
            }
            acum+=num;
            i++;
        }
    }
}
