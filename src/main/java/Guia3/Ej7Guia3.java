package Guia3;

import java.util.Scanner;

public class Ej7Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cor=0,inc=0;
        System.out.print("Ingrese una cadena en mayusculas y de longitud 5: ");
        String cad= sc.next();
        while (!"&&&&&".equals(cad)){
            if(cad.length()<=5&&"X".equals(cad.substring(0,1))&&"O".equals(cad.substring(cad.length()-1,cad.length()))){
                cor+=1;
            }else{
                inc+=1;
            }
        System.out.print("Ingrese otra cadena en mayusculas y de longitud 5: ");
        cad= sc.next();     
        }
        System.out.println("La cant de cadenas ingresadas que respentan el formato son "+cor);
        System.out.print("La cant de cadenas ingresadas que no respentan el formato son "+inc);
    }

}
