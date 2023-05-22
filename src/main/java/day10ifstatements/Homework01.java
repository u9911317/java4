package day10ifstatements;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {


        /*
    Homework
    1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
    uygun mesaj veren kodu yaziniz

    2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    Pazar ==> 1. gun , Pazartes ==> 2. gun...

    3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
    1==>January , 2==> February

         */
      // 1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        //uygun mesaj veren kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password...");
        String pwd = input.nextLine();

        if(pwd.equals("pwd123!")){
            System.out.println("Password is correct..");
        }else {
            System.out.println("Password is not correct..");
        }

       // 2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        //Pazar ==> 1. gun , Pazartes ==> 2. gun...
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the day ..");
        String name = scan.next();

        if(name.equalsIgnoreCase("Sunday")){
            System.out.println("1.Day");
        } else if (name.equalsIgnoreCase("Monday")) {
            System.out.println("2.Day");
        }else if (name.equalsIgnoreCase("Tuesday")){
            System.out.println("3.Day");
        }else if (name.equalsIgnoreCase("Wednesday")){
            System.out.println("4.Day");
        }else if (name.equalsIgnoreCase("Thursday")) {
            System.out.println("5.Day");
        }else if (name.equalsIgnoreCase("Friday")) {
            System.out.println("6.Day");
        }else if (name.equalsIgnoreCase("Saturday")) {
            System.out.println("7.Day");
        }else {
            System.out.println("Enter a correct day name");
        }

      //  3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
       // 1==>January , 2==> February
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please the number of the mounth..");
        int mounthNum = scanner.nextInt();

        if (mounthNum==1){
            System.out.println("January");
        } else if (mounthNum==2) {
            System.out.println("February");
        } else if (mounthNum==3) {
            System.out.println("March");
        } else if (mounthNum==4) {
            System.out.println("April");
        } else if (mounthNum==5) {
            System.out.println("May");
        } else if (mounthNum==6) {
            System.out.println("June");
        } else if (mounthNum==7) {
            System.out.println("July");
        } else if (mounthNum==8) {
            System.out.println("August");
        } else if (mounthNum==9) {
            System.out.println("September");
        } else if (mounthNum==10) {
            System.out.println("October");
        } else if (mounthNum==11) {
            System.out.println("November");
        } else if (mounthNum==12) {
            System.out.println("December");
        }else {
            System.out.println("Please enter a valid number of the mounth..");
        }
    }
}











