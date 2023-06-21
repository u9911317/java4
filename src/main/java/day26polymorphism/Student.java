package day26polymorphism;

public class Student {

    //Encapsulation ==> kapsulleme
    /*
    Encapsulation Nedir? (Data Hiding) veri saklamak
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklarim
     Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz? getmethod olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return typei okudugu variable in return typei ile ayni olur
    3) get methodun boolean bir variable icin olusturulmus ise get method ismi is ile baslar


      */
    private String stdId="AC20230614";

    public String stdName = "Ali Can";
    public int age = 23;
    private double notOrt=3.34;

    private boolean succesful=false;

    public String getStdId() {
        return stdId;

    }

    public double getNotOrt() {
        return notOrt;
    }
    //Encapsulation yapilan variable in data type i eger boolean ise get method
    public boolean isSuccesful() {
        return succesful;
    }

    /*
    Encapsulation ya[tigimiz datayi diger classlardan nasil degistirirz
    "set methodu" olusturarak Encapsulation edilmis datanin degerini degsitirebiliriz
    1)set methodlar hep public olur
    2)set methodlarin return type hep void olur
    3)set methodlar parametre kullanir , parametrenin data type i varaible ile ayni olur

    NOT : set method kullanarak var olan object uzerinde degisiklikler yaparak o object'i sanki
    yeni birr object'mis gibi kullanabiliriz

    NOt 2: get methodalrin diger adi getter, set methodlarin diger adi setter dir.
    getter ve setter larin ikisine birden "Java Beans" denir

    Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
 (setter() olusturma) yapabilir.ekim hoca

     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}




























