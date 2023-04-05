/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Guia5;

public class Ej6Guia5 {

    public static void main(String[] args) {
        int [][] mMagic = new int [3][3];
        int diagP=0,diagS=0,tot=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mMagic[i][j] = (int) (Math.random() * 9 + 1);
                tot += mMagic[i][j];
                if (i == j) {
                    diagP += mMagic[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            diagS += mMagic[i][2-i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mMagic[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Diagonal Principal "+diagP+", Diagonal Secundaria "+diagS);
    }
}
//i,j   i,j   i,j   i,j
//0,3   1,2   2,1   3,0
//i,3-0 i,3-1 i,3-2