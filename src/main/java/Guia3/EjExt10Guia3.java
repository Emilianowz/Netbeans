package Guia3;

import java.util.Scanner;

public class EjExt10Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,res = (int) ((Math.random()*10)*(Math.random()*10));
        System.out.println("Intente adivinar el resutado de la multiplicacion entre 2 numeros (0-10)");
        System.out.print("Ingrese un numero: ");
        do{
            num=sc.nextInt();
            if (num==res){
                System.out.print("Felicitaciones! Adivinó el resultado");
            }else{
                System.out.print("El numero ingresado no coincide con el numero a adivinar, vuelva a intentar: ");
            }
        }while (num!=res);
    }
}
