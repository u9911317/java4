package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        int arr []={1,2,34,45,5,67,8};
        System.out.println(Arrays.toString(arr));
       // Verilen arrayde kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yazin.
       int sayac =0;
       for (int w : arr){
           if (w%2==0){
               sayac++;
            }
        }

        System.out.println("array de "+sayac+"  adet cift sayisi "+(arr.length-sayac)+" adet tek sayi vardir");


        //ornek2: size verilen bir string arraydeki isimlerden 5 karakterden az karakter icerenleri consolda yazdiriniz

        String stdNames[]= new String[5];
        stdNames[0]= "cuneyt";
        stdNames[1]= "ajda";
        stdNames[2]= "filiz";
        stdNames[3]= "Tom";
        stdNames[4]= "ayhan";
        System.out.println(Arrays.toString(stdNames));

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));
        for (String w : stdNames){
            if (w.startsWith("f")) {
                continue;
            }
            System.out.println(w);

            //ARRAYS02 CLASS TEKRARI
            //ornek 1: Kullanicinin coklu datayi bir array e yerlestirebilmesi,
            //istedigi zaman durdurabilmesi icin gereken kodu yazin

        /*
        1) kullanicidan data almak icin Scanner object olustur
        2: coklu datayi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array a kac tane eleman koyacagini almaliyiz
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("eklemek istediginiz ogrenci sayid=sini girin");
            int num= scan.nextInt();

            String stdname[]= new String[num];
            System.out.println("durdurmak icin 'q' basiniz");

            for (int i = 0; i < stdname.length; i++) {
                System.out.println((i+1)+  ". ogrencinin ismini girin");
              String name=  scan.next();
              if (name.equalsIgnoreCase("q")){
                  break;
              }else {
                  stdname[i]=name;
              }
            }
            Arrays.toString(stdname);



        }


        }

        }












