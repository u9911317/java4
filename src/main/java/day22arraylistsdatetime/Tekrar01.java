package day22arraylistsdatetime;

import java.util.List;

public class Tekrar01 {
    public static void main(String[] args) {

        List<Double> prices = List.of(2.5, 1.23, 4.25, 2.5, 1.23, 4.0);//tekrarsiz  eleman bulma
        for (double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.println(w);
            }
        }
        //tekrarli eleman bulma
        List<Integer> heights = List.of(3, 13, 3);
        int counter=0;
        for (Integer w : heights) {
            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;
            }
        }
        if (counter==0){
            System.out.println("tekrarli");
        }else {
            System.out.println("tekrarsiz");
        }


    }
}
