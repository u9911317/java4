package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {

        //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH
        getInitilias("Ali Can", "Kemal Han", "Birgul Dusunur");

    }

    public static void getInitilias(String... s ){
        String initilias = "";
        for ( String  w: s  ){
          initilias= initilias+  w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initilias);
            initilias="";
        }

    }
}
