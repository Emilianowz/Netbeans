package Guia3;

import java.util.Scanner;

public class Ej6Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int op;
        String rta="";
        do{
            System.out.print("\nMENU\n\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\n\nElija Opcion: ");
            op = sc.nextInt();
            switch(op){
                case 1 -> System.out.println("La suma entre los numeros ingresados es: "+(num1+num2));
                case 2 -> System.out.println("La resta entre los numeros ingresados es: "+(num1-num2));
                case 3 -> System.out.println("La multiplicacion entre los numeros ingresados es: "+(num1*num2));
                case 4 -> System.out.println("La division entre los numeros ingresados es: "+(num1/num2));
                case 5 -> {
                    rta="";
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    rta = sc.next();
                    while (!(rta.equalsIgnoreCase("N") || rta.equalsIgnoreCase("S"))){
                        System.out.print("Ingrese la opcion nuevamente: ");
                        rta = sc.next();                        
                    }
                }
            }
        }while (!(rta.equalsIgnoreCase("s")));
    }
}