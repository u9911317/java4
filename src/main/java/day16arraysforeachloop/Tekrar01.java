package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {

        String arr []=new String[5];

        arr[0]="ali";
        arr[1]="alin";
        arr[2]="aliye";
        arr[3]="alican";
        arr[4]="alise";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());

        String brr[]= new String[5];
        brr[0]="edirne";
        brr[1]="eskisehir";
        brr[2]="mersin";
        brr[3]="elazig";
        brr[4]="antep";

        System.out.println(brr[0].length()+brr[1].length()+brr[2].length()+brr[3].length()+brr[4].length());

        int toplam= 0;
        for (String w : brr){
            System.out.println();
            toplam=toplam+w.length();

        }
        System.out.println(toplam);

        int notlar []=new int[6];

        notlar[0]=3;
        notlar[1]=34;
        notlar[2]=2;
        notlar[3]=32;
        notlar[4]=15;
        notlar[5]=7;

         int sonuc=0;
        int topla =0;
        for (int w: notlar){
            topla =topla+w;
            sonuc=topla/notlar.length;


        }
        System.out.println(sonuc);




        }


        }







































