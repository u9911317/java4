package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//Stringin ters cevrilmesi looplar ilede yapilir bu kisa yoldur
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//verilen index teki karakteri siler
        System.out.println(sb1);//ysae s avaJ
        //4,5,6 silinir 7 silinmez
        //4,5,6,silinir 7 silinmez
        sb1.delete(4, 7);//baslangic index dahil bitis index haric olmak uzere araligi siler
        System.out.println(sb1);//ysaeavaJ

        //sb1.replace(2,5,"O"); methodu 2 dahil 5 haric yani index 2,3,4 deki karakterlerin yerine "OOOOOOOOO" koyar
        sb1.replace(2, 5, "OOOOOOOOO");
        System.out.println(sb1);//ysOOOOOOOOOvaJ

        sb1.replace(2, 5, "XXX");//  ==> 2 dahil, 5 haric olmak uzere 2,3, ve 4 deki karakterlerin yerine X koyar

        sb1.insert(3, "XXX");
        System.out.println(sb1);//ysOXXXOOOOOOOOvaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Mava");

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //sonuc -1 ise sb2, sb3 den alfabetik olarak 1 onde demektir
        //sonuc 1 ise sb2, sb3 den alfabetik olarak 1 sonda demektir

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        /*
        compareto() iki sb'i esit mi diye kontrol etmek icin ilk harften baslayarak tüm karakterleri karşılaştırır.
        Aynı olan karakterler için bir şey return etmezken farklı olan ilk karakter için ascii
         tablosuna göre kaç değer geride veya ileride olduğunu yazdırır. tamamen aynı ise bize 0 return eder

         */
        //StringBuilder nasil string e cevirilir?
        //toString() methodu sayesinde cevrilir
        //String classta var olan ama stringBuilder classta var olmayan toUpperCase() methodu gibi methodlara ihtiyac duydugumuzda
        //toString() kullanarak string class methodlarini kullanabilirz
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA
        System.out.println(sb2);

        //String nasil stringbulilder r cevrilir?
        StringBuilder newS1 = new StringBuilder(str);
        System.out.println(newS1);


    }
}






































