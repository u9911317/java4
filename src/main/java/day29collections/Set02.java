package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //Ornek Ogrenci email adreslerini natural order a gore siralanmis olarak depolayiniz

         long t1= System.nanoTime();
        //1Yol
        TreeSet<String> emails = new TreeSet<>();
        emails.add("z@gnail.com");
        emails.add("bz@gnail.com");
        emails.add("kz@gnail.com");
        emails.add("v@gnail.com");
        emails.add("e@gnail.com");
        emails.add("a@gnail.com");
        emails.add("m@gnail.com");
        emails.add("h@gnail.com");
        System.out.println(emails);//[a@gnail.com, bz@gnail.com, e@gnail.com, h@gnail.com, kz@gnail.com, m@gnail.com, v@gnail.com, z@gnail.com]

        long t2= System.nanoTime();
        //2 Yol tavsiye edilir
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("z@gnail.com");
        emailsHs.add("bz@gnail.com");
        emailsHs.add("kz@gnail.com");
        emailsHs.add("v@gnail.com");
        emailsHs.add("e@gnail.com");
        emailsHs.add("a@gnail.com");
        emailsHs.add("m@gnail.com");
        emailsHs.add("h@gnail.com");


        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);

        long t3= System.nanoTime();
        System.out.println("treeset : " +(t2-t1));//tree set hizi
        System.out.println("hashset : " +(t3-t2));//hash set hizi
    }
}
