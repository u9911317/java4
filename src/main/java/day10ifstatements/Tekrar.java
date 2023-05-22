package day10ifstatements;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        //Example:  Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("lutefn bir sayi giriniz..");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("pozitif");
        } else if (num < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("notr..");

        }
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        Scanner inpt = new Scanner(System.in);
        System.out.println("kacinci gun oldugunu yazin");
        byte num1 = inpt.nextByte();
        if (num1 == 1) {
            System.out.println("sunday");
        } else if (num1 == 2) {
            System.out.println("monday");
        } else if (num1 == 3) {
            System.out.println("tuesday");
        } else if (num1 == 4) {
            System.out.println("wednesday");
        } else if (num1 == 5) {
            System.out.println("thursday");
        } else if (num1 == 6) {
            System.out.println("friday");
        } else if (num1 == 7) {
            System.out.println("saturday");
        } else {
            System.out.println("hatali giris yaptin ...lutfen 1 ile 7 arasinda bir sayi giriniz");
            //BOUNDARY VALUE ANALIYSIS BVA ==> DENIR BU TEST TEKNIGINE
        }

        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.


        Scanner inp = new Scanner(System.in);
        System.out.println("ay ismi girin..");
        String montName = inp.next();

        if (montName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (montName.equalsIgnoreCase("february")) {
            System.out.println(2);

        } else if (montName.equalsIgnoreCase("march")) {
            System.out.println(3);

        } else if (montName.equalsIgnoreCase("april")) {
            System.out.println(4);

        } else if (montName.equalsIgnoreCase("may")) {
            System.out.println(5);

        } else if (montName.equalsIgnoreCase("june")) {
            System.out.println(6);

        } else if (montName.equalsIgnoreCase("july")) {
            System.out.println(7);

        } else if (montName.equalsIgnoreCase("august")) {
            System.out.println(8);

        } else if (montName.equalsIgnoreCase("september")) {
            System.out.println();

        } else if (montName.equalsIgnoreCase("october")) {
            System.out.println(10);

        } else if (montName.equalsIgnoreCase("november")) {
            System.out.println(11);

        } else if (montName.equalsIgnoreCase("december")) {
            System.out.println(12);

        } else {
            System.out.println("invalid month name..");
        }

        /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner in = new Scanner(System.in);
        System.out.println("lutfen yasinizi girin");
        int age = in.nextInt();

        if (age < 0) {
            System.out.println("gecerli bir yas girin..");
        } else if (age < 5) {
            System.out.println("bebek");
        } else if (age < 13) {
            System.out.println("cocuk");

        } else if (age < 21) {
            System.out.println("genc");

        } else if (age < 31) {
            System.out.println("yetiskin");
        } else {
            System.out.println("tanimlanmamis yas..");
        }

        /*  Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner inppt = new Scanner(System.in);
        System.out.println("ucgenin kenarlari icin 3 tane uzunluk giriniz");

        double a =Math.abs(inppt.nextDouble()) ;
        double b =Math.abs(inppt.nextDouble()) ;
        double c =Math.abs(inppt.nextDouble()) ;


        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) &&  // a+b>c>|a-b|)
                          (a + c > b && b > Math.abs(a - c)) &&  // a+c>b>|a-c|
                          (b + c > a && a > Math.abs(b - c));

        if (ucgenmi) {

            if (a == b && b == c && a == c) {
                System.out.println("Ucgendir hemde eskanar ucgendir ");
            } else {
                System.out.println("Ucgendir ama eskanar degil.. ");
            }

        } else {
            System.out.println("Bu bir ucgen degildir");


        }
    }

}












