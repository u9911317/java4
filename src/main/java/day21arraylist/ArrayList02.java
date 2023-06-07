package day21arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmesi icin ayni index te ayni elemanlar olmalidir

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Kim");
        names2.add("Tom");
        names2.add("Jim");

        names1.equals(names2);
        boolean s= names1.equals(names2);
        System.out.println(s);//false

        //ornek : verilen iki integer lisstte tamamiyla ayni elemanlarin olup olmadigini kontrol edelim

        ArrayList<Integer> num1= new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer> num2= new ArrayList<>();
        num2.add(9);
        num2.add(10);
        num2.add(8);

        Collections.sort(num1);
        Collections.sort(num2);

       boolean result = num1.equals(num2);
        System.out.println(result);//true

        //ArrayListte bir elemanin ilk gorunumu nasil silinir?

        ArrayList<String> cities =new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("yozgat");
        cities.add("istanbul");
        cities.add("Istanbul");
        cities.add("yozgat");
        System.out.println(cities);

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));// sildigi islemi dogruluyor
        System.out.println(cities);

        //ArrayListte  bir eleman index kullanilarak nasil silinir
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        // ve o elemani silip silmedigini ifade eden true yada false return eder

        //remove() methodu index ile kullanilirsa bu indexte silmis oldugu datayi return eder





        //ArrayList olustururken sag tarafa(constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa iste ArrayList yazin isterseniz de List yazin ikiside calisir
        //Detaylari collections konusunda gorecegiz

        //Ornek : Bir integer list olusturun ve 12 elemanini siliniz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);


       // ages.remove(12);
      //  System.out.println(ages);

        //1.yol
       // Integer nonPrimitive =12;
       // ages.remove(nonPrimitive);
      //  System.out.println(ages);

        //2 yol
        ages.remove((Integer) 12); //TAVSIYE EDILEN YOL BU SILMEK ICIN
        System.out.println(ages);

        //        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        // 4. yol
//        System.out.println(ages);
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Bir ArrayListteki bir elemanin tum gorunumlerini nasil sileriz?
        //bir listteki bir elemanin tum gorunumlerini removeAll() ile silebiliriz
        // ama removeAll() methodu list ile kullanilir

        List<String >citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);















    }
}
























