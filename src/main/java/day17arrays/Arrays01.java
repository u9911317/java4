package day17arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Arrayleri kisa yoldan nasil olusturabilirz?
        int arr [] = {63,12,34,12,5,100,4};
        System.out.println(Arrays.toString(arr));//[63, 12, 34, 12, 5, 100, 4]

        //Ornek  1: Verilen arrayde kac tane cift sayi kac tane tekk sayi oldugunu bulan kodu yazin.

        int sayac =0;

        for ( int w : arr) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("array de "+sayac+" adet cift sayi  "+ (arr.length-sayac)+" adet tek sayi kullanilmistir");

        //ornek2: size verilen bir string arraydeki isimlerden 5 karakterden az karakter iceenleri consolda yazdiriniz

        String stdName [] = new String[5];
        stdName [0] ="Ajda";
        stdName [3] ="Ayhan";
        stdName [2] ="Tom";
        stdName [1] ="Filiz";
        stdName [4] ="Cuneyt";
        System.out.println(Arrays.toString(stdName));

        for (String w : stdName){
            if (w.length()<5){
                System.out.println(w);
            }
        }
        //ornek 3: size verilen bir string arraydeki isimleri alfabetik siraya koyduktan sonra
        ///"F" ile baslayan isimler haric diger isimleri consola yazin

        //Note sort() methodu sayisal data typlelari kucukten buyuge siralar .(ascending order)
        //Note sort() methodu String data typelari alfabetik olarak siralar.(alphabetic order)
        //Note 3 (ascending order)  +(alphabetic order) =Natural order
        //Note 4 sort() methodu array elemanlarini (Natural order) a gore siralar.

        Arrays.sort(stdName);
        System.out.println(Arrays.toString(stdName));

        for (String w : stdName){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);

        }








    }
}
