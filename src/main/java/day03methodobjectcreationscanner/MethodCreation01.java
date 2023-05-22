package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        double kup = getCube(5);
        System.out.println(kup);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //method olusturmak icin ikinci yol
        //ornek 2 : girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
        //mainmethod icindeyken method ta kullanilacqak variable lari olusturun
        String str = "TechproEdu";

        //method ismi ve parametre yazariz
        //kirmizi kisimn uzerinde bekleyip create method a tiklariz intelliji otomatok olaaak bir method olusturur
        //daha sonra kendi istegimize gore dizayn ederiz
        printConsole(str);

        //ornek3 verilen 2 tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullanin
        int a = 3;
        int b = 5;
        carpmaYap(a, b);

        //ornek 4 verilen bir tam sayinin kar3esini hesplayip console yazdiran method olustur
        int sayi = 5;
        karesiniAl(sayi);

    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullanin
     static double getCube (double a){
        return a*a*a;

    }
    //note access modifeir i default yapmak isterseniz access modifier YAZMAYIN

    //ornek 2 : girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print (String str){
        System.out.println(str);

    }
    //eger bir method yeni bir data uretmiyorsa return type void olur
    //methodun return type i void ise method body icinde return keyword yazilmaz
    /*
    1 cemberin cevresini hesaplayan methodu olusturup kullanin#
    2 dairenin alanini hesaplayan methodu olusturup kullanin
     */

    //Odev









}
