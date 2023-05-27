package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan alacagimiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakaminin toplamini yazan kodu yazin
        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi girin..");
        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 bolup kalani almaliyiz
        //% ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        //bir tam sayiyi bir tam sayiya bolersek java sonucu kesinlikle tam sayi yapar
        // java yuvarlama yapmaz, ondalikli kismi iptal eder
        //dolaiyisiyla bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz
        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
        //java  bu durumda yuvarlama yapmaz, ondalik kismi iptal eder
        //dolayisiyle bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz




        //son rakami al
        int birlerBasamagi = number%10;
        //sayiyi kucult
       number = number/10;

       //sondan ikinci rakami al
       int sondanIkinci = number%10;

       //sayiyi kucult
        number= number/10;

        //sondan ucuncu rakam
       int sondanUcuncu = number%10;
       //sayiyi kucuklt
        number= number/10;

        //sondan dorduncu rakam
        int sondanDorduncu = number%10;
        //sayiyi kucult
        number= number/10;

        //sondan besinci rakam
        int sondanBesinci = number%10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);


    }
    //homework
    //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yazin
        //ornegin 3,4,5 icin ortalama (3+4+5)/3 = 5
    //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulun
    //ornegin ==>312 icin 3+2+1 =6
}






