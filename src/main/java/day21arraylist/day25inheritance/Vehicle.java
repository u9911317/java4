package day21arraylist.day25inheritance;

public class Vehicle {
    public Vehicle() {

        this(2000);
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {
        System.out.println("Vehicle 2");


    }
}
        /*
         1) Child classtan bir object olusturdugunuzda
          Constructor en ustteki parent classtan baslatilarak alta dogru calisitirilir
          2) Child class taki constructor dan Parent class taki constructor a gidebilmek icin super() kullanilir
 3) Parent Class ta birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler yardimi
  ile secilebilir
 4) Ayni class icindeki constructor i secmek icin this() kullanilir ,Ayni class ta birden fazla constructor varsa istenilen
 constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secilebilir
 5)super() ifadesini yazmak istege baglidir, yazmassaniz da java  sanki super() varmis gibi davaranir,
 Ama kodunuzun daha okunur kilmak icin yazmaniz tavsiye edilir
 6) super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
 7) Bir constructor icinde super() ve this() iafdeleri sadece bir kere kullanilir (Bakiniz 6. kural)
 8)Inheritance da variablarlari cagirmak icin thuis veya super kullanilir
 this ayni class icindeki variablla eri veya methodlari cagirmak icin kullanilir
super parent class icindeki variablla eri veya methodlari cagirmak icin kullanilir

  6) super() ve this() ifadeleri constructor icinde herzaman ilk satirda olmalidir
    7) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir. (Bakiniz 6.)
    8) Inheritance da variablllari ve methodlari cagirmak icin this veya super kullanilir
       this ayni class icindeki variable veya methodlari cagirmak icin kullanilir
       super parent class icindeki variable veya methodlari cagirmak icin kullanilir




             */

    /* inheritance notlar:
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/