package day01variables;

public class Homework01 {

    public static void main(String[] args) {

        /*
        1) 3 farkli data turunde variable olusturun ve bunlari farkli satirlarda yazdirin
        2) ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variable olusturup toplamini yazdirin.
         */

       //homework 1 :3 farkli data turunde variable olusturun ve bunlari farkli satirlarda yazdirin
        byte  myAge = 34;
        System.out.println("Benim yasim" +" "+ myAge);

        double weight= 57.34;
        System.out.println("kilom" +" " + weight);

        boolean isHeTired = false;
        System.out.println(isHeTired);

        //homework 2:ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        String countryName= "England";
        String cityName = "London";

        System.out.println(countryName);
        System.out.println(cityName);

        //homework 3:iki tamsayi turunde variable olusturup toplamini yazdirin.

        int savasVeBaris = 1225;
        int annaKaranina = 1062;
        int toplamSayfasayisi = savasVeBaris+annaKaranina;

        System.out.println("Savas ve Baris ve Anna Karanina toplam sayfa sayisi"+ " "+  toplamSayfasayisi);

        {
                int x = 12, y = 25;
                System.out.println("Original values of x and y");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                x = x ^ y ^ (y = x);
                System.out.println("Swapped values of x and y");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
            /*
        Variable
        bellekte (memory) ayrilmis olan alanin (reserved area) adidir
        Variable icinde deger saklayan bir konteynirdir
        //bir variable olustururken icerisine koyacagimiz datanin deger alabilecegi degerlere uygun bir data turu secmeliyiz
        //ornegin bir sehrin nufusundan bahsediyorsak variablemizin data turu String, boolean,char, veya double alamayiz
        //geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu secebiliriz
        //kurs boyunca genelde tam sayilar icin int ,ondalikli sayilar icin double kullaniriz
         */













    }
}
