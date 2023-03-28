package Guia3;

import java.util.Scanner;

public class EjExt4Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.print("Ingrese un numero entre el 1 y el 10: ");
        do{
            num = sc.nextInt();
        }while (!(num>=1 && num<=10));
        switch (num){
            case 1: System.out.print("El numero ingresado corresponde al numero romano I");break;
            case 2: System.out.print("El numero ingresado corresponde al numero romano II");break;
            case 3: System.out.print("El numero ingresado corresponde al numero romano III");break;
            case 4: System.out.print("El numero ingresado corresponde al numero romano IV");break;
            case 5: System.out.print("El numero ingresado corresponde al numero romano V");break;
            case 6: System.out.print("El numero ingresado corresponde al numero romano VI");break;
            case 7: System.out.print("El numero ingresado corresponde al numero romano VII");break;
            case 8: System.out.print("El numero ingresado corresponde al numero romano VIII");break;
            case 9: System.out.print("El numero ingresado corresponde al numero romano IX");break;
            case 10: System.out.print("El numero ingresado corresponde al numero romano X");break;
        }
    }
}
