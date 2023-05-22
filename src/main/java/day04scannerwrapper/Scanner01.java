package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //ornek : Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdirin

        //1.adim :Scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);

        //2.Adim : Kullaniciya ne istediginize dair mesaj verin
        System.out.println("Ilk ismini giriniz..");

        //3.Adim:Uygun methodu kullanrak kullanicinin vverdigi datayi memory e yerlestiriniz
        //next methodu kullanicidan tek kelimeli string almak icin kullanilir
        String firstName=  input.next();

        System.out.println("Soyismini giriniz..");
        String lastName =input.next();

        System.out.println(firstName+" "+lastName);


    }
}








