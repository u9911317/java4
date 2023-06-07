package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar02 {
    public static void main(String[] args) {

        int sayilar[] = new int[6];
        sayilar[0] = 8;
        sayilar[1] = 2;
        sayilar[2] = 11;
        sayilar[3] = 12;
        sayilar[4] = 6;
        sayilar[5] = 9;

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(sayilar[0] + sayilar[sayilar.length - 1]);

        int min = sayilar[0];
        int max = sayilar[0];

        for (int w : sayilar) {
            min = Math.min(min, w);
            max = Math.max(max, w);

        }
        System.out.println(min + max);

        String colors[] = new String[6];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "orange";
        colors[3] = "yellow";
        colors[4] = "brown";
        colors[5] = "red";
        System.out.println(Arrays.toString(colors));

        for (String w : colors) {
            if (w.equals("yellow")) {
                break;
            }
            System.out.println(w);


        }
    }

}






































