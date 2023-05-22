package day02datatypesmethodcreation;

public class Homework {

    public static void main(String[] args) {
      int toplamNufus =  ulkeNufusu(2345,9877666);
        System.out.println(toplamNufus);

    }
    public static int ulkeNufusu (int kore, int us ){
       return kore+us;
    }
    private static int cocukSayisi(int ezgi, int ela ){
       return ela+ezgi;
    }
}
