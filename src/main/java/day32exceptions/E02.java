package day32exceptions;

public class E02 {
    public static void main(String[] args) {

        //biririrne donusturulemuecek data typrelerini donusturmekte israr ederseniz ClassCastException atar
        Object obj = 70;
        try {
            String str  =(String) obj;
            System.out.println(str);

        } catch ( ClassCastException e) {

            System.err.println("her data typei her data type na cevrilemez");

        }
    }
}













