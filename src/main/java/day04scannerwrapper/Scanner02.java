package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //ornek /: kullanicidan adresini alin ekrana  yazdir
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adresinizi girniz..");

        //nextline() methodu kullanicidan cok kelimeli String almaya yarar
       String adress= input.nextLine();
        System.out.println(adress);


    }
}















