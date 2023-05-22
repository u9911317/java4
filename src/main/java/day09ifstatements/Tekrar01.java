package day09ifstatements;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        //Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");
        String isim = input.nextLine();

        char ilkisim = isim.toUpperCase().charAt(0);
        char ikinciIsm = isim.toUpperCase().split(" ")[1].charAt(0);
        char ucuncIsim = isim.toUpperCase().split(" ")[2].charAt(0);

        System.out.println(""+ilkisim+"."+ikinciIsm+"."+ucuncIsim+".");

        Scanner scn = new Scanner(System.in);
        System.out.println("isminizi girin ");
        String ad = scn.next();

        char ikiIsm = ad.split(" ")[1].charAt(0);





    }
}
