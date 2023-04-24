package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    /*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.

            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
     */


public class HashMap01 {

    public static void main(String[] args) {

        //Map nasıl oluşturulur ?
        HashMap<String,Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);

        // get() methodu "key" ile calisir ve "value" kismini verir
        int usaPopulation = countryPopulation.get("USA");
        System.out.println("usaPopulation = " + usaPopulation); //usaPopulation = 400000000

        // Butun "key"leri nasıl alabiliriz ?
        Set<String>  keys = countryPopulation.keySet();
        System.out.println(keys); //[Turkiye, Netherland, USA, Germany, Albania]

        //Butun "value"lari nasıl alabilirim ?

        Collection<Integer> values = countryPopulation.values();
        System.out.println(values); //[83000000, 18000000, 400000000, 83000000, 30000000]
        
        
        //Example 1 : countryPopulation map'indeki nufüsların ortalaması nedir ? 

        Collection<Integer> valuesOrt = countryPopulation.values();
        System.out.println(valuesOrt);
        
        int sum = 0;
        for(Integer w : valuesOrt){
            sum+=w;
        }
        System.out.println( sum/valuesOrt.size()); //122800000


        //entrySet() "entry"leri kalıp halinde alip bize "Set"in içine koyarak verir.
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz.
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries); //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=30000000]


        //Example 2 : countryPopulation MAp'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamını bulunuz.

        int toplam =0;
        for(Map.Entry<String,Integer> w : entries){
            toplam = toplam + w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);//614000034


    }
}
