package Guia3;

import java.util.Scanner;

public class EjExt3Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u")){
            System.out.print("La letra ingresada es una vocal");
        }else{
            System.out.print("La letra ingresada es una consonante");
        }
    }

}
