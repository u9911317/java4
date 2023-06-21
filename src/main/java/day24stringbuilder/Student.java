package day24stringbuilder;

public class Student {
    /*
    Access Modifier
    1)public
    2)prodected
    3)default ( Access Modifier i default yapmak icin access modifier yazmayiz)
    4)private

    Note:  Access Modifier genisten dara dogru siralama
    public== > protected==> default--> private
    Note: public her classtan kullanilabilir
          protected ==> olanlar baska package larden kullanilamaz
          ancak baska package da child class icinden kullanilabilir
          defualt ==> olanlar baska package dan kullanilamazlar
          private ==> olanlar sadece olusturulduklari class icinde kullanilabilirler

         Note: "protected" ile "default" un farkini soyleyiniz
            protected olanlar baska package lardan kullanilamaz
            ancak baska package da child class icinden kullanilabilir
            default olanlar baska package lardan kullanilamaz


     */

    //public her class dan kullanilabilir
    public String stdName = "Ali Can";

    //protected olanlar kendi package ve baska package lardan child classlardan gorulur
    protected String address = "Istanbul";

    //default olanlar baska package tan kullanilamazlar
    String email="alican@gmail.com"; //default burasi

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String ssnId = "12345679";
}






























