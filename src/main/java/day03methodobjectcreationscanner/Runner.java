package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //object nasil olusturulur

        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java da objeleri olusturmak icin kullanilan ozel bir methoddur.
        //Class ismi  + Object ismi + Assigment Operator + "new" keywordu + Constructor
        Car myCar = new Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();
        myCar.calis();

        Student aliCan = new Student();
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.feed();
        aliCan.study();

        //homework iconde isim ve yas variable ile teach methodu bulunan bir Teacher objesi
        //olusturun bu ozellikleri kullanin
        OdevTeacher teach = new OdevTeacher();
        System.out.println("Teacher's name:   " +   teach.name);
        System.out.println("Teacher's school  = " + teach.school);


    }


}
