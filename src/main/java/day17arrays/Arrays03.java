package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanin array de olup olmadigini anlamak ici gereken kodu yazin
        String names[] = {"K", "C", "R", "A", "S"};//kisa yol olusturmasi
        String el = "R";

        //1.way
        int counter = 0;
        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }


        //2.yol :binarySearch() methodu  calisma mantigi once sort() uygulamaniz gerekir binary search () ile direk ortadaki
        //elemana geliyor eger aradigim ortadaki ise ilk geliste buluyor bulamazsak ascii degerlerini kıyasliyor
        // buyuk mu kucuk mu diye

          /*
        1)  binarySearch() methodunu sort() kullanmadan kullanmayiniz, cunku  binarySearch() mantigi sirali elemanlar icin gecerlidir.
        2)  binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir.
        3)   binarySearch() methodundan aldiginiz index 0 veya 0 dan buyuk ise bu o eleman arrayde var demektir
        4)  binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */


        //2.way : binarySearch() methodu hizli calisir.
        Arrays.sort(names);
        int result = Arrays.binarySearch(names, el);
        System.out.println(Arrays.toString(names));
        System.out.println(result);

        if (result < 0) {
            System.out.println("array doesnt have " + el);
        } else {
            System.out.println("Array has " + el);
        }

        int num1 = Arrays.binarySearch(names, "A");
        System.out.println(num1);//0 ==> var hem de indexi sifirdir

        int num2 = Arrays.binarySearch(names, "K");
        System.out.println(num2);// 2 == hemde indexi ikidir


        int num3 = Arrays.binarySearch(names, "U");
        System.out.println(num3);// -6 ==> "-" bu eleman yok demek
                                // 6 ise olsaydi Altinci eleman olurdu demek


    }
}
