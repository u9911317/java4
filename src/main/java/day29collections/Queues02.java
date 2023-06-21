package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Orange");
        line.add("Egg");
        line.add("Meat");
        line.add("Toamatoes");
        line.add("Apple");
        line.add("Bread");
        System.out.println(line);//[Apple, Meat, Bread, Orange, Toamatoes, Milk, Egg]



        /*
        "Queue" bir interface'dir, bu yuzden constructor'i yoktur. Dolayisiyla object olustururken new keyword'unden sonra
        "Queue" kullanilamaz, Data type'i Queue olan bir object olusturmak icin new keywordundna sonra;
            1) LinkedList
            2) PriorityQueue
        classlari kullanilabilir
        "Queue" olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore
        siralama hakkiniz olur
         */


        //Deque ==> Double Queue (iki uclu queue)
        //Deque deki add(), get(), peek() vb... methodlar first-last
        //sekilinde iki uclu olarak bulunur
        Deque<String> d = new LinkedList<>();

        d.add("Milk");
        d.add("Orange");
        d.add("Egg");
        d.add("Meat");
        System.out.println(d);




    }
}






















