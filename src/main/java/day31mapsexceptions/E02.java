package day31mapsexceptions;

public class E02 {
    public static void main(String[] args) {

//        String s = "1234";
//        convertStrinToInt(s);
        String t ="123a";
        convertStrinToInt(t);
    }
    //icinde rakamlar disinda karakter olan bir stringi sayiya cevirmek isrteseiz NumberFormatException aliriz
    public static void convertStrinToInt(String s){

        try {
            Integer intS=  Integer.valueOf(s);
            System.out.println(intS +1 );
        }catch (NumberFormatException e ){
            System.out.println("bir stringin sayiya donsturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }



    }
}


























