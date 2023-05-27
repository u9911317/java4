package day04scannerwrapper;

import java.util.Scanner;

public class TekrarOdev {

    public static void main(String[] args) {

        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini buln kodu yazin
        //ornegin 3,4,5 icin ortalama (3+4+50/3 = 5
        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulun
        //ornegin ==>312 icin 3+2+1 =6
        Scanner input =new Scanner(System.in);
        System.out.println("3 tane sayi girin");
        int sayi= input.nextInt();

        int birlerBasmg= sayi%10;
       sayi = sayi/10;

       int sondanIkinci = sayi%10;
       sayi = sayi/10;

       int sondanUcuncu = sayi%10;

        System.out.println(birlerBasmg+sondanIkinci+sondanUcuncu/(sayi));







    }
}
