package day33exceptionsenumiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

       /*
    1) Iterator'lar Looplarin yaptigi ayni isi yapar.
    2) Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3) Iterator'lar ile loop'lar arasinda performans farki yoktur.
    4) Iterator'lar bir collection'dan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir.
    5) Iki tip iterator vardir;
         a) Iterator : Bu sadece eleman silmede kullanilir
                  Eleman eklemek veya elemani degistirmek mumkun degildir.

         b) LıstIterator : Bu eleman silebilir, ekleyebilir ve degistirebilir.

    Note : "Iterator" sadece soldan saga (ilk elemandan son elemana) calisir
           "LıstIterator" ise iki yonlu calisabilir.
             */

        List<String> myList = new ArrayList<>();
        myList.add("Bera");
        myList.add("Berra");
        myList.add("Berk");
        myList.add("Berat");
        myList.add("Beranur");
        System.out.println(myList);

        //iterator kullanarak eleman silelim
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()) {//hasNext() methodu pointer a senden sonra eleman var mi diye sorar
            //Eleman varsa true yoksa false return eder
            String el = myItr.next();
            //next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            if (el.equals("Bera")) {
                myItr.remove();//next() methodunun return ettigi elemani siler
            }

        }
        System.out.println(myList);//[]

        //ListIterator kullanimi
        List<String> yourList = new ArrayList<>();
        yourList.add("Bera");
        yourList.add("Berra");
        yourList.add("Berk");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el + "*");//set() methodu listi update et,eye yarar
        }
        System.out.println(yourList);

        //previous method kullanimi
        List<String> list3 = new ArrayList<>();
        list3.add("Bera");
        list3.add("Berra");
        list3.add("Berk");
        System.out.println(list3);

      ListIterator<String> listItr = list3.listIterator();

        //pointere en saga almak icin
        while (listItr.hasNext()){
            listItr.next();
        }
        //pointeri yukaridaki kod ile en sonda biraktigimiz icin Elemanlari en sondan basa dogru yazdirabiliriz
        while (listItr.hasPrevious()){
         String el =   listItr.previous();
            System.out.println(el+ "<===");
        }


    }
}















