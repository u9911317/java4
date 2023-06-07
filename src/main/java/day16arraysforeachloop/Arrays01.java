package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a =13;
        //bu yapinin icinde sadece bir tane data depolanabilir
        //ama biz kod yazarken bir yapinin icnde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur

        //Array nasil olusturulur?
        String stdNames [] = new String [5];

        //Arrayler console nasil yazdirilir
        //toString() methodunu kullanmadan sadece array ismi ile yazarsak java o arrayin adresini yazar
        System.out.println(Arrays.toString(stdNames));

        /*
        Arrayler diger coolectionlardan cok cok daha hizlidir super fast
        Arrayler diger coolectionlardan daha az memory kullanirlar
         */

        //Array e eleman ekleme nasil yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Berk";
        stdNames[4]="Berra";
        stdNames[0]="Ekim";
        stdNames[1]="Birgul";
        System.out.println(Arrays.toString(stdNames));

        //Arrayden spesifik bir elemani nasil aliriz?
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);

        //Ornek 1: Arraydeki her elemanin sonuna ! isareti koyarak ekrana yazdirin
        //length() stringlerde method (parantexzli) arraylerde ise parantezsiz yazilir (method degil)
        //  0      1       2      3     4          index sayisi
       // [Ekim, Birgul, Benna, Berk, Berra]


        for (int i=0;   i <stdNames.length ;   i++) {
            System.out.println(stdNames[i] + "!");
        }



    }
}


































