package sorubankasi;

public class Swapp {
    public static void main(String[] args) {

    int sayi1 =12;
    int sayi2 =5;
    int temp;

    temp=sayi1;
    sayi1=sayi2;
    sayi2=temp;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        String s = "Besiktas1903";
       System.out.println(s.replaceAll("[0-9]", "").length());



    }
}
