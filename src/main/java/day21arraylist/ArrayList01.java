package day21arraylist;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {

          /*
        1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacağınız eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisni 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;

            a)Array ler super hizlidir.
            b)Array ler memory de cok az yer kaplar.
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir

        6) Arrayler pirimitive data type lari ve "reference" lari depolayabilir.
           Ama ArrayList ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplarlar
         */



        //Arraylist nasil olusturur
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //Arraylist consola nasil yazdirilir?
        System.out.println(ages);

        //Arraylistlere eleman naisil eklenir?
        //Arraylistlere eleman eklemek icin add() methodu kullaniriz
        //add() methodu sizin verdiginiz siraya gore ekler "List" e ekler (Insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 456);
        ages.add(3, 756);
        ages.add(4, 876);
        ages.add(888);
        System.out.println(ages);

        //Liste coklu eleman nasil eklenir? veya liste baska bir list nasil eklenir
        //Bir list'e coklu eleman eklemek icin o elemanlari oncelikle bir list'in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(2, newAges);
        System.out.println(ages);

        //Arraylist te eleman sayisi nasil bulunur?
        //size() methodu bir listteki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);

        //ArrayList te specisif bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar GET METHODU SEPET NEYSE ONA KONUR INT=INT STRING=SSTRING
        int el1 = ages.get(1);
        System.out.println(el1);

        //arraylist te specific bir elemani nasil degistiririz?
        ages.set(6, 111);
        ages.set(4, 313);
        System.out.println(ages);

        //Bir listte tum elemanlari nasil sileriz
        // ages.clear();
        //System.out.println(ages);

        //Arraylistte spesicif bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(313);
        System.out.println(r);

        //Bir Arraylisttin bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu Arraylist bos ise true degilse false return yapar.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Size verilen bir listtin bos olup olmadigini kontrol eden kodu yazin
        ArrayList<String> names =new ArrayList<>();
        names.add("Gulce");
        names.add("Berra");
        names.add("Berk");
        names.add("Baran");
        names.add("Ela");

        //1.Way
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. way RECOMENDED TAVSIYE EDILIR JAVA OYLE ISTIYOR KOLAYI VAR

        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        /*
        Bir methodu ogrenirken asagidaki 3 seyi ogrenin
        1-  Method ne is yapar.
        2-  Method nasil kullanilir.
        3-  o method size neyi veri
        4 -  Methodun return type
 */


    }
}


























