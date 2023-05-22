package day09ifstatements;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");
        int num = input.nextInt();


        //1. yol
       if (num % 2 == 0){
           System.out.println("cift sayidir");
       }
       if (num % 2!= 0 ){
           System.out.println("tek sayidir");

           }

        //2. Yol kontrol edilen condition sayisi daha az oldugu icin tavsiye edilir
        if (num%2 ==0){
            System.out.println("cift sayidir");

        }else { // aksi halde bu kisim calisir
            System.out.println("tek sayidir");

        }

       }


    }













