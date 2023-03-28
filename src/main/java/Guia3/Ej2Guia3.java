package Guia3;

import java.util.Scanner;

public class Ej2Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String pass = sc.next();
        if(pass.equals("eureka")){
            System.out.print("Correcto");
        }else{
            System.out.print("Incorrecto");
        }
    }
    
}
