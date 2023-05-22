package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        //[] regex de koseli parantez kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]

           10) sadece space karakteri ==>\\s
           space karakteri haric dersekte ==> \\S

           sadece rakamlar  ==> \\d digit ==> rakam demek
           rakamlar haric ==> \\D
         */
        String t2 = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //ornek 2: "t2" stringindeki tum rakamlari ve harfleri "1" e cevir
        String t3 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t3);

        // ornek 3) "t2" stringindeki tum sesli ve harfleri "?" e cevir
        String t4 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t4);

        //orenk 4) "t2" stringindeki kucuk harfler disindKI tum chareacterlei "<>" cevirn
        String t5 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t5);

        //orenk 5  "t2" stringindeki tum harfler disindaki tum karakterleri + cevir
        String t6 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t6);

        //orenk 6 "t2" stringindeki space ler disindaki tum karakterleri ? cevir
        String t7 = t.replaceAll("[^ ]", "?");
        System.out.println(t7);

        //orn 7 "t2" stringindeki sesli harfler disindaki tum karaktelri "&" cevir
        String t8 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t8);


    }
}





















