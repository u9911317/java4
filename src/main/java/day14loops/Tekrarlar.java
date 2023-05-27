package day14loops;

public class Tekrarlar {
    public static void main(String[] args) {

        // String t = "Java";
        //String ters ="";

        //Ornek: Bir String i ters ceviren kodu yaziniz
        // "Java" ==> "avaJ"

        //1. Yol
        //          "Java";

        String t = "Java";
        String ters = "";

        for ( int i = t.length()-1  ; i>=0  ; i--  ){
         ters =   ters + t.substring(i,i+1);

        }
        System.out.println(ters);

        //2.yol
        String u = "Java";
        String ters1="";

        for ( int i =u.length()-1  ; i>=0  ;i--   ){
         ters1=   ters1+ u.charAt(i);

        }
        System.out.println(ters1);

        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.

        String duz ="Ey edip adanada pide ye";
        String ters2="";

        for (int i =duz.length()-1;  i>=0 ; i--) {
            ters2 =ters2+duz.charAt(i);
        }
        System.out.println(ters2);

        if (duz.equalsIgnoreCase(ters2)){
            System.out.println("palindrom dur");
        }else {
            System.out.println("palindrom degildir");
        }

        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //  5+6+7+8 ==> 26
        int sum =0;
        for (int i =5; i <9 ; i++) {
            sum=sum+i;

        }
        System.out.println(sum);
        ////*********LOOPS02

       ///Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9 ==>504
       int multply =1;

        for (int i = 7; i < 10; i++) {
          multply=  multply *i;

        }
        System.out.println(multply);

        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578  ==> 5 + 7 + 8 = 20
        int toplam =0;
        int num = 578;
        num = Math.abs(num);

        for (int i =num;    i > 0;     i=i/10 ) {
         toplam=   toplam + i%10;

        }
        System.out.println(toplam);



    }
}
































