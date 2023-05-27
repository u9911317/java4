package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //ornek 1:Integer array olustur 6 eleamn koy icine .Bu elemanlarin en kucugu ve en buyugunun toplaini yaz
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 28;
        ages[2] = 45;
        ages[3] = 23;
        ages[4] = 14;
        ages[5] = 67;

        System.out.println(Arrays.toString(ages));

        //1.yol
        //sort () methodu arraydeki elemanlari kucukten buyuge dizer
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);

        //2.yol

        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(maximum+minimum);

        //Ornek 2: String bir  array olustur 6 elemn ekle yellow dan onceki elemanlari ekleyin
        String colors []=new  String[6];
        colors[0]="red";
        colors[1]="green";
        colors[2]="orange";
        colors[3]="yellow";
        colors[4]="broen";
        colors[5]="red";

        System.out.println(Arrays.toString(colors));

        for (String w: colors){
            if (w.equals("yellow")){
                break;
            }
            System.out.println(w);
        }


    }
}






































