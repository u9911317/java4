package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        /*
        1TreeMap "thread-safe" ve "synchronized" degildir.
        Note:Map lerde multi thread kullanmamiz gerektiginde sadece Hashtable kullanabilirsiniz, cünkü tek alternatif budur.
        2)TreeMap Entry leri key lerine göre natural order a göre siralar . Bu yüzden cook yavastir,
        3)TreeMap lerin key lerinde null kullanilamaz ama value larinda istediginiz kadar kullanabilirsiniz
         */

        long t1 = System.nanoTime();

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",180000000);
        countryPopulations.put("Turkiye",830000000);
        countryPopulations.put("Belgium",120000000);
        countryPopulations.put("Mexico",1250000000);
        countryPopulations.put("Brasil",21500000);
        countryPopulations.put("France",750000000);
        countryPopulations.put("Finland",80000000);
        countryPopulations.put("Germany",850000000);
        System.out.println(countryPopulations);//{Belgium=120000000, Brasil=21500000, Finland=80000000, France=750000000, Germany=850000000, Mexico=1250000000, Netherland=180000000, Turkiye=830000000, USA=400000000}

        long t2 = System.nanoTime();

        HashMap<String,Integer>countryPop=new HashMap<>();
        countryPop.put("USA",400000000);
        countryPop.put("Netherland",180000000);
        countryPop.put("Turkiye",830000000);
        countryPop.put("Belgium",120000000);
        countryPop.put("Mexico",1250000000);
        countryPop.put("Brasil",21500000);
        countryPop.put("France",750000000);
        countryPop.put("Finland",80000000);
        countryPop.put("Germany",850000000);

        TreeMap<String, Integer> countryPopTree = new TreeMap<>(countryPop);
        System.out.println(countryPopTree);//{Belgium=120000000, Brasil=21500000, Finland=80000000, France=750000000, Germany=850000000, Mexico=1250000000, Netherland=180000000, Turkiye=830000000, USA=400000000}

        long t3 = System.nanoTime();

        System.out.println(t2-t1);//treemap
        System.out.println(t3-t2);//hashmap

    }
}











