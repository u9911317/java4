package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //kullanicidan bir dikdortgenin uzunlugunu aliniz
        //a) Alanini hesaplayin ==> kisa kenar * Uzun kenar
        //b) Cevresini hesaplayiniz ==> 2*kisa kenar  + 2*uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu girin");
        double longSide= input.nextDouble();

        System.out.println("Alan = "+(shortSide*longSide));
        System.out.println("Cevre = "+(2*shortSide +2*longSide));


    }
}














