package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        //Anlik zamanda bilesenler nasil alinir
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);
        int nanoSecond = myCurrentTime.getNano();
        System.out.println(nanoSecond);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirlir?
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm --> 24 lu saat sistemi
        hh : mm --> 12 li saat sistemi
        hh : mm a --> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss --> 24 lu saat sistemi AM, PM gosterilir
        HH : MM --> yanlis format MM aylar icin kullanilir
        “mm” minute demektir.  “MM” month demektir
        dd-MM-yyyy --> gun ay yil
        MMM  --> Aug (ayin ilk 3 harfi)
        MMMM  --> August
 */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH : mm");
        String formatedMyCurrentTime = dtf.format(myCurrentTime);
        System.out.println(formatedMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedMydate = dtf2.format(myDate);
        System.out.println(formatedMydate);

        //Tarih GUn/ay ismini ilk 3harfi sekiline cveiriniz
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatedMydate2 = dtf3.format(myDate);
        System.out.println(formatedMydate2);

        //Tarih GUN/Ay ismi/ YIL sekline ccevirin 25/Aug/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatedMydate3 = dtf3.format(myDate);
        System.out.println(formatedMydate3);

        //Baska bir zamandilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kac ?
       LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

    }
}





















