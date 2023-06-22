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
      s=  s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);

       String[] letter = s.split("");
        System.out.println(Arrays.toString(letter));

        HashMap<String,Integer> hsm= new HashMap<>();
        for (String w :letter){
            Integer num = hsm.get(w);
            if (num==null){
                hsm.put(w,1);
            }else {
                hsm.replace(w,num+1);
            }
        }
        System.out.println(hsm);


    }
}





























