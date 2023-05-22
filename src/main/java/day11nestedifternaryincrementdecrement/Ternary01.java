package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statement
        //ornek1: sayi 10 daan kucukse konsola kucuk yazin degilse ise kucuk degil deyin
        //---------if else cozumu-----
        int num =3;
        if(num<10){
            System.out.println("kucuk");
        }else {
            System.out.println("kucuk degil");
        }
        //------ternary cozumu-------
        //Condition  ?  Condition true ise calsir : Condition false ise calisir ;
       String sonuc = num<10      ?      "Kucuk"                :       "Buyuk"               ;
        System.out.println(sonuc);

        //ornek 2 : sayi cift ise konsola cift ,tek ise tek yazin
      String sonuc1 =  num%2==0 ? "cift" : "tek";
        System.out.println(sonuc1);

        int k =13;
        if (k%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }
      String result =  k%2==0 ? "cift" : "tek";
        System.out.println(result);

        // Ornek 3: sayi 0 dan buyuk ise pozitif degilse ekrana pozitif degil yazin
       String sonc = num>0 ? "pozitiftir" : "pozitif degil";
       int i = 5;
        System.out.println(i > 0 ? "pozitif" : "Pozitif degil");

        //Ornek 4 : kullanixcidan iki sayi aliniz buyuk olmayan (kucuk veya esit olan ) sayiyi yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi girin");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1 . yol if else
        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        //2.    yol
       double result2 = a<b ? a : b;
        System.out.println(result2);

    }
}












