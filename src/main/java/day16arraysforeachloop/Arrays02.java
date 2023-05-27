package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example :1 string array olusturun icine 5 tane eleman ekleyin ilk eleman ile son elemanin icerdegi karakter sayilari
        //toplamini ekrana yazdirin
        String arr [] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Art";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Art, English, Art]

        //                  Math . 4                     4 art      3 artin karakter sayisini verir
        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //orn String bir array olustur icine 5 tane eleman ekle tum elemnlarin icerdgi karakter sayisini al

        String brr [] = new String[5];
        brr[0]="oslo";
        brr[1]="van";
        brr[2]="ankara";
        brr[3]="nigde";
        brr[4]="edirne";


        //1. yol for loop
        int totalChar =0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar+ brr[i].length();

        }
        System.out.println(totalChar);

        //2.yol for each loop (enhanced loop)
        //baslangic degeri . loop un calisma sarti ve increment/ decrement kismini kendisi halleder
        //for-each -loop "Array "lerde ve   "collection"larda kullanilir

        //Java collection ve Arraylere ozel for each loop olusturmus.Hata payi cok az
        // ..Egerki Array ve collection ile calisyorsak ilk tercih For each Loop olmalidir.gulce

        // for-each-loop "Array" lerde ve "collection" larda kullanilir
        /*
        kalibini olusturalim
        for(DataType  w: arr/collection ){
            calisacak kodlar
        }
        */


        int sum =0;
        for (String w : brr){
          sum=sum+  w.length();
        }
        System.out.println(sum);

        //ornek 3: Notlar adinda Integer bir array olustur icine 6 tane not yrlestir ve not ortlmasni yazdir

        int notlar [] = new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=40;
        notlar[3]=80;
        notlar[4]=90;
        notlar[5]=30;

        System.out.println(Arrays.toString(notlar));
        int toplam =0;
        for (int w : notlar){
          toplam=  toplam+w;
        }
        System.out.println(toplam/ notlar.length);








        }


    }































