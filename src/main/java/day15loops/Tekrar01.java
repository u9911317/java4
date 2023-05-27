package day15loops;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {

        //Ornek 1: 3 ten 6 ya kadar tam sayilari console a yazdiriniz
        //1. yol : for loop

        for (int i = 3; i <7 ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println();

        //2. yol: while loop
        int i =3;
        while (i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //WHILELOOP01
        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz
       int k =23;
       while (k>11){
           if (k%2==0){
               System.out.println(k+" ");
           }
           k--;
       }
        System.out.println();

        //ornek 3: 6 dan 19 kafar tum tek sayilari yazin
        int m=6;
        while (m<20){
            if (m%2!=0){
                System.out.println(m+" ");
            }
            m++;

        }
        //DOWHILELOOP02
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("lutfen bir sayi giriniz");
            int num = scan.nextInt();

            if (num>=100){
                System.out.println("kazandiniz");
            }else {
                System.out.println("kaybettiniz");
                break;
            }

        }while (true);

        //DOWHILELOOP03
         /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        int counter= 0;
        do {
            if (counter==4){
                System.out.println("hesabiniz bloke olmustur");
                break;
            }

            System.out.println("username giriniz");
            String userName= scan.next();

            System.out.println("pasword giriniz");
            String pasword= scan.next();

            if (userName.equals("admin") && pasword.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            }
            counter++;

        }while (true);




    }
}
