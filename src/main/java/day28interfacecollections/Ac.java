package day28interfacecollections;

public interface Ac {

    public abstract void cool();
    void run();
    int price =2000;


    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilicagini childa birakirsaniz child classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisiyla interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    6)Coklu interface parentlerin herbirinin icnine ayni isimli methodlar koyabiliriz
    Mesala Ac ,nin Enfinn ve Securty nin icine run methodu koymak gibi
    Child class herhangi birini ovverride ettiginde hepsini override etmis our
     7)  a)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "final" dir. bu yüzden interface icindeki variable i olusturdugunuzda
    mutlaka deger atamasi yapmalisiniz . Bilindigi gibi "Final" variable larin degerleri degistirilemez
        b)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "public" dir.
        c)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "static" dir.
     ==>Dolayisiyla interface lerde variable cagirirken interface adini kullanarak cagiririz. bu hem static variable olmanin geregidir, hem de okunurlugu arttirir
     8)Normalde "interface" icine "concrete method" konulamaz ama bazi özel durumlarda "concrete method"
     koymamiz gerekirse default keyword kullanarak bunu yapabiliriz.
     9) "default" keywordunu kullanarak oluşturduğumuz "concrete methodlara interface'in child classından
      object oluşturarak ulaşabilirsiniz"
      9) "default" keyword unu kullanarak olusturdugunuz "concrete method"lara inter face in child class indan
     object olusturarak ulasabilirsiniz.
     "Static keywordunu" kullanarak olusturdugunuz concrete methodlara ulasmak icin object olusturmaya gerek yoktur
      interface ismi yeterlidir
     10) interfacelerden object olusturulumaz interface lerin constructoru yoktur.
     11)

            Child        Parent              keyword
            class        class       ==>     extends
            interface    interface   ==>     extends
            class        interface   ==>     implements
            interface    class       ==>     OLAMAZ

      Ayni ise extens farkli ise implements kullaniriz ve interface concrete classin child i olamaz

      Abstrack class ile interface arasindaki farklar nelerdir?

       1)Abstract classlar hem abstract hem de concrete methodlar icerebilir fakat interface ler sadece abstract method icerir
   ama interface lerde  istersek "default" ve "static" keywordlerini kullanarak "concrete" method üretebiliriz
   2)Abstract class lar multiple inheritance i desteklemez. ama interface ler destekler
   3)Abstract class lar icinde her türlü variable olusturulabilir. interface ler icindeki variabllar public,static ve final olmak zorundadir
   4)Interface Class in child i olamaz ama Abstract class classin child i olabilir
   5)Abstract class larda constructor vardir ama object üretemez,interfacelerde constructor hic yoktur bu
   yüzden object üretilemez



     */




    }

