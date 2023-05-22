package day03methodobjectcreationscanner;

//javanin util kutuphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1.Adim Scanner Class tan object olustur
        Scanner input = new Scanner(System.in);

        //2. Adim kullaniciya ne istedginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi girin..");

        //3.adim uygun methodu kullanarak kullanicinin verdgi dtatyi memory e yerlestirniz
      byte age =  input.nextByte();

        System.out.println(age);
        System.out.println("age = " + age);


    }
}
