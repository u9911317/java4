package day02datatypesmethodcreation;

public class TekrarVeOdev {

    public static void main(String[] args) {

        int sonuc = alanBul(8,22);
        System.out.println(sonuc);

        int sonuc1 = cevreBul(4,12);
        System.out.println(sonuc1);

        //Variable olusturma 1
        String cityName = "Ankara";
        cityName = "Izmir";

        //sehir plaka ismi yaz
        byte sehirPlaka = 34;
        sehirPlaka= 35;
        System.out.println(sehirPlaka);

        //ornek 3: basarili mi sorusu icn
        boolean isSuccesful = false;
        isSuccesful= true;
        System.out.println(isSuccesful);

        //Variables02 tekrar



//Homework02
        //1)bir dikdörtgenin alanını hesaplayan methodu oluşturun ve kullanın
        //2)dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanınız

    }
    public static int alanBul(int a, int b){
        return a*b;
    }
    public static int cevreBul(int a, int b){
        return 2*(a+b);
    }



    }

