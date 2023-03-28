package Guia3;

import java.util.Scanner;

public class EjExt5Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la clase de socio: ");
        String tipo = sc.next();
        System.out.print("Ingrese el costo del tratamiento: $");
        int bruto = sc.nextInt();
        if ("A".equalsIgnoreCase(tipo)){
            System.out.print("El importe a pagar por el tratamiento es $"+(bruto*0.5));
        }else if ("B".equalsIgnoreCase(tipo)){
            System.out.print("El importe a pagar por el tratamiento es $"+(bruto*0.65));
        }else if ("C".equalsIgnoreCase(tipo)){
            System.out.print("El importe a pagar por el tratamiento es $"+(bruto));
        }
    }
}
