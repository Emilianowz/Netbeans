package Guia3;

import java.util.Scanner;

public class EjExt8Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=1,par=0,impar=0;
        System.out.println("Ingrese numeros, para cortar ingrese un multiplo de 5:");
        int num=sc.nextInt();
        while (num<0){
            System.out.println("Ingrese nuevamente un numero positivo");
            num=sc.nextInt();   
         }
        do{
            num=sc.nextInt();
            while (num<0){
                System.out.println("Ingrese nuevamente un numero positivo");
                num=sc.nextInt();
            }
            if (num%2==0){
                par++;
            }else if (num%2==1){
                impar++;
            }
            cont++;
        }while (!(num%5==0));
        System.out.println("El total de numeros ingresados es "+cont);
        System.out.println("El total de numeros pares ingresados es "+par);
        System.out.println("El total de numeros impares ingresados es "+impar);
    }
}