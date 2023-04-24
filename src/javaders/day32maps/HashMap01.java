package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        //"key"i tekrarli kullandigimizda hata vermez sadece en son verilen entry'nin degerini kabul eder.
        //Bu yöntem value guncellemede kullanılabilir.Buna "overwrite" denir.
        stdAges.put("Tom",83);


        // HashMap'ler "entry" leri rastgele siralar bu yuzden en hizli map'dir.
        // HashMap'ler "entry" leri siralarken "key" lere bakarak siralama yapar.
        System.out.println(stdAges); //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

       /*

       Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir. Maplerde key ve valuler {} icine konulur.
        Eger key tekrarli kullanilirsa kod hata vermez, ancak tekrarli olarak yazilan key'in en son ekleneni alir,
        onu yazdirir. Key'in yeni degerini(value) alir. Ornek "Tom" 76 idi, ikinci eklemede "Tom" 83 oldu ve sonucta
        "Tom" 83 olarak yazildi. Bu yontem VALUE GUNCELLEME'de tavsiye edilmese de kullanilabilir.
        Tavsiye edilen yöntem aşağıda yaptığım gibidir. replace methoduyla yani.

        */


        //replace() methodu "value" lari "key" leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);
        System.out.println(stdAges); //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //bu da aynı şeyi yapar ama çok açık angelina'nın yaşı 58 ise 61 yap der ama 58 değilse yapmaz.
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent("Ali", 60); methodu Map'de "Ali"key olarak yoksa Map'e "Ali=60"i ekler, varsa eklemez.
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}


        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));//83 verir
        System.out.println(stdAges.getOrDefault("Tom", 0));//83 verir.

        //Ama eğer Map'de omayan bir değer olsaydı o zaman işte fark olurdu asağıdaki gibi.

        System.out.println(stdAges.get("Ayse"));//null verir
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0 verir.


        //hey java value'lar arasında 77 var mı diye sorar.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //remove("Ali"); methodu "key"kullanarak entry'i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        //stdAges.putAll(kidsAge); methodu stdAge Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAge Map'i degismis olur.         stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}

    }
}
