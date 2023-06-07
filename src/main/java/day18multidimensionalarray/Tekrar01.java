package day18multidimensionalarray;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {


 /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-kat bilgisi array
       *  icerdeki  array'lere  inner-daire array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        int a [][]= new int[3][2];

        a[0][1]=5;
        a[1][1]=34;
        a[2][0]=123;
        a[2][0]=45;
        a[2][0]=87;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));

        System.out.println(a[0][1]);
        System.out.println(a[1][1]);

        System.out.println(Arrays.toString(a[1]));
        String str [][]= {{"ali","eda"},{"esra","banu"},{"berra"}};
        System.out.println(Arrays.toString(str));

       // /Ornek 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz.
        int num =0;
       for (String [] w: str){
         num=  num+w.length;

       }
       //MD02 TEKRAR
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        // Ornek : Yukaridaki students arrayinde icinde "m" olan isimleri console a yazdiriniz

       for (String[] w :  students){
           for (String k :w){
               if (k.contains("m")){
                   System.out.println(k);
               }
            }

        }
       // // Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
       int nums [][]= {{23,5},{6,9},{4}};
       int result =1;

       for ( int [] w: nums){
           for (int k : w){
            result=   result*k;
           }
       }
        System.out.println(result);

       //MD03 TEKRAR
        //Ornek : iki boyutlu bir arrayi tek boyutlu bir array a ceviriniz
      int numbers [][]= {{4,6},{4,8},{3,6}};
      int toplamelesayi=0;

      for ( int [] w :numbers  ){
        toplamelesayi= toplamelesayi+w.length;
          }
        System.out.println(toplamelesayi);

    int newArray []= new  int[toplamelesayi];

    int idx=0;
      for (  int [] w : numbers ){
          for ( int k :  w){
              newArray[idx]=k;
              idx++;

          }
      }
        System.out.println(Arrays.toString(newArray));






      }
    }
























