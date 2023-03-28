package Guia3;

import java.util.Scanner;

public class EjExt6Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a las que se le tomara su altura: ");
        int cont=0,N = sc.nextInt();
        float alt,acum1=0,acum2=0;
        for(int i=0;i<N;i++){
            alt=sc.nextFloat();
            acum2+=alt;
            if (alt<1.60){
                cont++;acum1+=alt;
            }
        }
        System.out.println("El promedio de altura de personas con altura menor a 1,6 es "+(acum1/cont));
        System.out.print("El promedio de altura de las "+N+" personas es "+(acum2/N));
   }

}
