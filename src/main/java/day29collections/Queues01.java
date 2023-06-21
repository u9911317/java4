package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("Milk");
        depo.add("Meat");
        depo.add("Egg");
        depo.add("Cheesa");
        System.out.println(depo);

        depo.remove();
        System.out.println(depo);//[Meat, Egg, Cheesa]

        depo.peek();
        System.out.println(depo.peek());//Meat (copy + paste)

        System.out.println(depo.element());//Meat
        System.out.println(depo);//[Meat, Egg, Cheesa]

        System.out.println(depo.poll());
        System.out.println(depo);//[Egg, Cheesa]

        depo.clear();
        System.out.println(depo.poll());//null
       // System.out.println(depo.remove());//exception
       // System.out.println(depo.element());//exception
        System.out.println(depo.peek());//null




    }
}





















