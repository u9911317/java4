package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        //Note: java "pass by value" sayesinde variable larin orjinal degerlerini korur
        int shirtPrice=100;

        //java methoda gonderirken orjinal degeri degil ,kopyasini gonderir ve degisen deger kopya olur
        System.out.println(discount("student",shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));
        System.out.println(discount("senior", shirtPrice));


        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orjinal
        System.out.println(shirtPrice);//100

        shirtPrice=discount("veteran",shirtPrice);
        System.out.println("shirt kampanya "+shirtPrice);


    }
    //Discount Methodunu olusturalim
    public static int discount(String type, int price){
        switch (type){
            case "students" :
              price=  price-10;
              break;
            case "veteran" :
                price=  price-20;
                break;
            case "senior" :
                price=  price-5;
                break;
            default:
                price=price;
        }
        return price;
    }

      /*
    Pass By Value:
    1) Java "pass by value" kullanir
    2) Yani java method larin original degeri degistirmesine musade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur veo o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
         4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16

     Pass By Reference:
    1) Pass by Reference da method a reference yollanir
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistir.
    Bu yuzden "C#" gibi Pass By Reference kullanan dillerde method variable in orjinal degerini degistirir.
 */







}





























