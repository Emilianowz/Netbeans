package Guia3;

public class EjExt2Guia3 {

    public static void main(String[] args) {
        int A,B,C,D,aux;
        A=(int) (Math.random()*10);
        B=(int) (Math.random()*10);
        C=(int) (Math.random()*10);
        D=(int) (Math.random()*10);
        System.out.println("A="+A+" B="+B+" C="+C+" D="+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.print("A="+A+" B="+B+" C="+C+" D="+D);
    }

}
