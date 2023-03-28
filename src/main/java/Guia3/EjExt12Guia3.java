/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia3;

import java.util.Scanner;

public class EjExt12Guia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n,x="";
        int num=0;
        System.out.println("Presione la tecla Enter para incrementar el contador en 1");
        while (num<1000){    
            num++;
            x = sc.nextLine();
            if (x.isEmpty()){
                if (num<10){
                    n = "00".concat(String.valueOf(num));
                    n = n.replace("3","E");
                    System.out.print(n.substring(0,1)+"-"+n.substring(1,2)+"-"+n.substring(2,3));
                }else if (num<100){
                    n = "0".concat(String.valueOf(num));
                    n = n.replace("3","E");
                    System.out.print(n.substring(0,1)+"-"+n.substring(1,2)+"-"+n.substring(2,3));
                }else{
                    n = String.valueOf(num);
                    n = n.replace("3","E");
                    System.out.print(n.substring(0,1)+"-"+n.substring(1,2)+"-"+n.substring(2,3));
                }
            }
        }
    }
}
