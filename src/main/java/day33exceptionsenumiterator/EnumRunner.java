package day33exceptionsenumiterator;

public class EnumRunner {

    public static void main(String[] args) {

        //Enumdaki bir sabite nasil ulasilir?
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);

        //Adana sabitinin ismine ulasalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        //istanbul plaka koduna ulsalim
        int istanbulPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);

        //Ankranin postakoduna ulaslim
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);

    }


}







































