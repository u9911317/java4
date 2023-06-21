package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) "String builder':' classi da string ureten bir class'dir.
        2) String class kullanarak string uretiriz, nicin "String builder" classi da olusturuldu?

         String immutable (degistirilemez) String uretir.
        "String builder" class mutable (degistirilebilir) String uretir.

        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
        3) "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir

         */
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t += "?";

        //String i degistirdikten sonra ayni string e assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler


        String a = "Money";
        a = a + "More";

        //mutable
        //Stringbuilder kullanarak string olusturmanin 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);//Python!

        //Stringbuilder kullnarak string olusturmanin 2. yolu
        StringBuilder sb2 = new StringBuilder();//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");

        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//34

        //capacity() ve length arasindaki fark nedir?

         /*
            capacity() java nin size verdigi data depolama yer sayisidir
            length() ise size verilen data depolama yerinin kullanilan kismidir

            Java baslangic olarak size capacity i 16 olarak verir.
            siz verilen capacity'i asarsaniz java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
            16==> 16*2+2  - 34==> 34*2+2
         */

            //Defualt capacity i nasil degistirebiliriz?
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");
        System.out.println(sb3.capacity());//3
        System.out.println(sb3.length());//3



    }
}


























