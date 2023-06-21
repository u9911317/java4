package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class Odev {
    public static void main(String[] args) {


        /*
        Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
         */
        String s = "Hello Henry!";
        s = s.replaceAll("\\p{Punct}", "");//tum noktalama isaretleri gitti
        System.out.println(s);

        String letters[] = s.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String,Integer> occ= new HashMap<>();//letters arrayindeki harfler birer birer map de var mi yook mu kontrol ediyoz

        for ( String w:letters){
            Integer numOfOcc = occ.get(w);
            if (numOfOcc==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOcc+1);
            }
        }
        System.out.println(occ);


    }
}





























