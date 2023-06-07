package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {

        int a = 5;

        String stB[] = new String[3];
        stB[0] = "jjj";
        stB[1] = "jjj";
        stB[2] = "jjj";
        System.out.println(Arrays.toString(stB));

        System.out.println(stB[2]);//spesifik eleman alma

        //Ornek 1: Arraydeki her elemanin sonuna ! isareti koyarak ekrana yazdirin
        //length() stringlerde method (parantexzli) arraylerde ise parantezsiz yazilir (method degil)
        //  0      1       2      3     4          index sayisi
        // [Ekim, Birgul, Benna, Berk, Berra]

        for (int i = 0; i < stB.length; i++) {
            System.out.println(stB[i] + "!");

            //Example :1 string array olusturun icine 5 tane eleman ekleyin ilk eleman ile son elemanin icerdegi karakter sayilari
            //toplamini ekrana yazdirin
            String str[] = new String[5];
            str[0] = "alinn";
            str[1] = "alican";
            str[2] = "ali";
            str[3] = "aliko";
            str[4] = "alinn";
            System.out.println(Arrays.toString(str));
            System.out.println(str[0].length() + str[str.length - 1].length());

            //orn String bir array olustur icine 5 tane eleman ekle tum elemnlarin icerdigi karakter sayisini al
            String eds[] = new String[4];
            eds[0] = "wssa";
            eds[1] = "wssann";
            eds[2] = "wssffa";
            eds[3] = "wssaww";

            int total = 0;
            for (int k = 0; k < eds.length; k++) {
                total = total + eds[k].length();
            }
            System.out.println(total);


            int sum = 0;
            for (String w : eds) {
                sum = sum + w.length();
            }
            System.out.println(sum);

            //ornek 3: Notlar adinda Integer bir array olustur icine 6 tane not yerlestir ve not ortalamasini yazdir

            int notlar[] = new int[6];

            notlar[0] = 44;
            notlar[1] = 67;
            notlar[2] = 34;
            notlar[3] = 30;
            notlar[4] = 20;
            notlar[5] = 78;

            System.out.println(Arrays.toString(notlar));
            int toplam = 0;
            for (int w : notlar) {
                toplam = toplam + w;
            }
            System.out.println(toplam / notlar.length);
        }
        //ornek 1:Integer array olustur 6 eleaman koy icine .Bu elemanlarin en kucugu ve en buyugunun toplamini yaz
        int sayi[] = new int[4];

        sayi[0] = 23;
        sayi[1] = 14;
        sayi[2] = 10;
        sayi[03] = 60;

        System.out.println(Arrays.toString(sayi));
        //sort () methodu arraydeki elemanlari kucukten buyuge dizer
        Arrays .sort(sayi);
        System.out.println(Arrays.toString(sayi));
        System.out.println(sayi[0] +sayi [sayi.length-1]);

        //2.yol





    }
}



























