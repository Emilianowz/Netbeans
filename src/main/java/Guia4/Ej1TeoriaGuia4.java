/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia4;

import java.util.Scanner;

public class Ej1TeoriaGuia4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String fraseConcatenada = concatenar(frase);
        System.out.println(fraseConcatenada);
    }

    public static String concatenar(String palabra) {

        String fraseNueva = "";

        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                    fraseNueva = fraseNueva + "@";
                    break;
                case "e":
                    fraseNueva = fraseNueva + "#";
                    break;
                case "i":
                    fraseNueva = fraseNueva + "$";
                    break;
                case "o":
                    fraseNueva = fraseNueva + "%";
                    break;
                case "u":
                    fraseNueva = fraseNueva + "*";
                    break;
                default:
                    fraseNueva = fraseNueva + palabra.substring(i, i + 1);
            }

        }
        return fraseNueva;
    }
}
