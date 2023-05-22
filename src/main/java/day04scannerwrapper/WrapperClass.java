package day04scannerwrapper;

public class WrapperClass {

    public static void main(String[] args) {
        //primitive        char,    boolean , byte ,    short ,    int,        long       float,  double
        //Wrapper Class    Character Boolean , Byte     Short,     Integer     Long       Float  Double

        //Wrappaer classlar non primitive dir o yuzden memoryde cok yer kaplarlar
        //O YUZDEN SART DEGILSE WRAPPER CLASS kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic bir method goremezsiniz cunku primitiveler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bir cok method gorursunuz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p= 12;
        Byte e= 12;

        //Ornek 1) short type nin minimum ve maximum degerlerini yazan kodu yaz
       short maxShort= Short .MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort= Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


       //Ornek 2: int data type nin minimum degeri ile byte data type inin maximum degerleri toplamini bulunuz.

        int intMn= Integer.MIN_VALUE;
        byte bytMx = Byte.MAX_VALUE;
        System.out.println(bytMx+intMn);


        int intMin =Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //ornek 3: Primitive int i wrapper Integer a ceviriniz
        int num =19;
        Integer wrapperNum = num;

        int k = 34;
        Integer wppr = k;

        int nm = 23;
        Integer wrpperNm =nm;

        //ornk 4; Wrapper Bytte primitive byte a cevir UNBOXING kutudan cikarma  denir
        Byte l = 12;
        System.out.println(l);
        byte primitiveL =l;
        System.out.println(primitiveL);

        //ornek 5 Primitive char i Wrapper Character e cevir AUTOBOXING DENIR

        char c ='b';
        Character y =c;

        char initial ='m';
        Character initialWrappar= initial;

        //ornk 6 Wrapper Booleani primitive boolean acevir Unboxing

        Boolean f = true;
        boolean dogruMu=false;

        Boolean isOldWrapper = true;
        boolean isOldPrimitive = isOldWrapper;

        Boolean isGood = false;
        boolean isGoodP =isGood;




















    }
}
