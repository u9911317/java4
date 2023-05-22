package day03methodobjectcreationscanner;

public class OdevCemberHesapla {

    public static void main(String[] args) {

       // 1 cemberin cevresini hesaplayan methodu olusturup kullanin ===> 2*pi*r
        cemberCevre(3*4.12*6);
        System.out.println(cemberCevre(3*4.12*6));

       // 2 dairenin alanini hesaplayan methodu olusturup kullanin ===> pi* r kare
        daireninAlani(2.18*4*4);
        System.out.println(daireninAlani(2.18*4*4));


    }
    // 1 cemberin cevresini hesaplayan methodu olusturup kullanin ===> 2*pi*r
    public static double cemberCevre(double h){
        return 3*4.12*6;

    }
    // 2 dairenin alanini hesaplayan methodu olusturup kullanin ===> pi* r kare
    public static double daireninAlani (double a ){
       return  2.18 * 4 *4;

    }

}
