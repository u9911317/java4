package day09ifstatements;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {


        int number = 123;
        number = Math.abs(number);
        if (number>99 && number<1000){
            System.out.println("Sayi uc basamaklidir");

        }

        int num = 87;
        num= Math.abs(num);
        if (num>10 && num<100){
            System.out.println("cift sayidir");
        }
        String str = "kmm";
        char ch = str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)){
            System.out.println(ch);

        }
        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2 = str.charAt(2);
        if (str.indexOf(ch2)== str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
       int rakam = input.nextInt();

       if (rakam % 2 == 0){
           System.out.println("cift sayidir");
       }if(rakam %2 != 0){
            System.out.println("tek sayidr");  // 1. yol
        }

       if (rakam %2 == 0){
           System.out.println("cift sayidir");
       }else {
           System.out.println("tek sayidir"); //2. yol
       }

        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner inpt =new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char cs= inpt.next().charAt(0);

        if (cs>='A' && cs<='Z'){
            System.out.println("buyuk harf");
        }
        if(cs>='a' && cs<='z')
            System.out.println("kucuk harf");

        if (cs >='A' && cs<='Z'){
            System.out.println("buyuk harf");
        } else if (cs>='a' && cs<='z') {
            System.out.println("kucuk");

        }else {
            System.out.println("harf degil");
        }
        // Java  ==> AV
        String st = "Java";
        int sonIndex = st.length()-1;
        String sonuc = st.substring(1,sonIndex).toUpperCase();
        System.out.println(sonuc);



    }

}








