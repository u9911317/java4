package day32exceptions;

public class E03 {

    /*
    throw keyword u bir methodun body si icnde istedigigmiz yerde, istedigimiz kosullarrrrrr icin
    istedigimiz kadar exception atmamizi saglar

    throw keyword yazildikta sonra
    Throw Keyword bir methodun body si icinde istedigimiiz yerde istedigimiz
    kosullar icin , istedigimiz kadar Exception atamamizi saglar,
    Throw Keyword yazildiktan sonra bir Exception class objesi olusturulur

     */
    /*Throw Keyword bir methodun body si icinde istedigimiiz yerde istedigimiz
    kosullar icin , istedigimiz kadar Exception atamamizi saglar,
    Throw Keyword yazildiktan sonra bir Exception class objesi olusturulur

    Exception class constructor inin parantezi icine istediginiz Exception mesajini yazabilirsiniz     */



    public static void main(String[] args) {

        try {
            printAge(-76);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    public static void printAge (int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else{
            System.out.println(age);
        }
        System.out.println(age);

    }

}



























