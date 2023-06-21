package day26polymorphism;

    public class Animal {

     /*
    1) Parent Class daki methodu child class icinde ozellestirerek kullanmaya Overriding denir.
    2) Overriding de methodun signature a dokunulmaz,(method signature = method ismi + parantez)
        methodun body  si degistirilir
    3) private methodlar override edilemezler
    4) Child Classdaki methodun access modifieri parent Classdaki override edilmis method(Overriden Method) un
    access modifierindan dar olamaz. Aynisi olabilir yada daha genis olabilir
    5) Child class da override edilen methodun return type i ile parent taki methodun return type i arasinda "IS-A Relationship "varsa iliskisi
    varsa return type degisitirilebilir
    6) Methodun return type i primitive ise overriding yaparken return type degistirilemez. Cunku return type ya ayni olur veya
    parent tan secilir, ama primitive ler arasinda parent child iliskisi olmadigindan aynisi olmak zorundadir
     7) Child da override edilen methodun return typei ile parenttaki methodun return typi arasinda "IS-A Relationship "
    yoksa return type degisitirilemez.
    Mesela;
    Integer wrapper class ile Long wrapper class arasinda "IS-A Relationship" iliskisi YOKTUR. o yuzden degistirilemez
    8) Methodun return type i void ise, Overriding yaparken return type degistirilemez.
    9) "static" methodlar override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
    mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle java
    static methodlarin override edilmesine izin vermez.
    10)final methodlar override edilemezler. final methoadlarin bodys i degistirilemezler ama override ederken
    method body degistirirz bu yuzden java final methodlarin oveeride edilmesine izin vermez

          a) Final keywordunu variable larda kullanabilirsiniz
        i) final variable a mutlaka deger atanmalidir
        ii) ilk atanan deger degistirilemez
    b) Final keywordunu method larda kullanabilirsiniz
         i) final methodun bodysi degistirilmez
        ii) method bodysi degistirilemeyince override yapmak mumkun olmaz
    c) Final keywordunu class larda kullanabilirsiniz
        i) class final ise o classin childi olamaz

   Polymorphism = Method overloading + method overriding





     */


    public void eat() {
      //parennteki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Animals eat ..");
    }

    public void drink() {
        System.out.println("Animals drink ..");

    }
     public Animal create(){
        return new Animal();
     }
     public int add(int a, int b){
        return a+b;
     }
     public Integer multply(Integer a, Integer b){
        return a*b;
     }
     public final double circleArea(double r){
        return 3.14*r*r;
     }


}




























