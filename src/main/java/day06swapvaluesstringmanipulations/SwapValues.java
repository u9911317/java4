package day06swapvaluesstringmanipulations;

public class SwapValues {

    public static void main(String[] args) {

        //Swap : Yer degistirmek.
        //1. kap : Patates  2. kap Domates ==> swap => 1. kap :Domates  2. kap : Patates
        int a=12;
        int b = 5; // swapten sonra a=5, b=12 olacak
        int temp = 0;

        //1. Adim
        temp =a;
        //2. Adim
        a=b;
        //3.Adim
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.: YOl
        int elma= 12;
        int armut= 5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma+armut;
        armut = elma- armut;//12
        elma= elma-armut;//

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        int x=12;
        int c =5;
        int temp1=0;

        temp1 =x;
        x=c;
        c=temp1;
        System.out.println("x = " + x);
        System.out.println("c = " + c);

        x=12;
        c=5;




    }
}








