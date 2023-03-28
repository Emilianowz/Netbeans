package Guia3;

import java.util.Scanner;

public class Ej3Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra de 8 letras: ");
        String words = sc.next();
        if (words.length()==8){
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
    }
}
    
