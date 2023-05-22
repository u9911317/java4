package day09ifstatements;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {

        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz..");
        char ch = input.next().charAt(0);
//1.YOL

        if (ch>='A'  && ch<='Z'){
            System.out.println("Buyuk harf");

        }
        if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf");

        }
//2. YOl
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");

        }else if(ch>='a' && ch<='z') {
            System.out.println("kucuk harf");
        }else {
            System.out.println("harf degil");
        }
    }
}










