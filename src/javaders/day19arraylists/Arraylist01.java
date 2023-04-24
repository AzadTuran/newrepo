package javaders.day19arraylists;

import java.util.ArrayList;

public class Arraylist01 {
    /*
    1)Ayni data type'indeki coklu data'ları depolamak için Array kullanılırız.

    2)Array'lerin bir negatif yonu var; icine koyacağınız eleman sayisini en basta belirlemek zorundasınız.

    3)Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu,bu yapi eleman sayisinda esnektir.
      Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.

    4)"ArrayList" yerine sadece "List" de diyebiliriz.

    5)Java "Arraylist"leri oluşturduktan sonra Array'leri iptal etmedi cunku;
      i)Array'ler super hızlıdır.
      ii)Array'ler memoryde çooook az yer kaplar.

    6)Array'ler primitive data type'leri ve "reference"lari depolayabilir."ArrayList" ler non-primitive data type' lerini depolar;
      bu yuzden "ArrayList"ler Array'lerden daha cok yer kaplar.

     */
    public static void main(String[] args) {
        //ArrayList nasil oluşturulur ?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages); //[]


        //ArrayList'e eleman nasıl eklenir ?
        //1.way
        ages.add(12);
        ages.add(24);
        ages.add(9);//add() methodu elemanları "giris sırasına" göre list yapar.(insertion order)
        System.out.println(ages);//[12, 24, 9]

        //2. way:
        ages.add(1,99);//1.indexe 99 ekler
        System.out.println(ages);//[12, 99, 24, 9]

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3. way: addAll() methodu bir listi diger listin icine yerlestirir.
        ages.addAll(price);
        System.out.println(ages);//[12, 99, 24, 9, 23, 33]

        //4. way:
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'te eleman sayisi nasil bulunur?
        int numOfElement = ages.size();
        System.out.println(numOfElement);//8

        //ArrayList'te spesific bir eleman nasıl alınır?
        int eleman1 = ages.get(3);//get() methodu index kullanarak istediğimiz elemani almaya yarar.
        System.out.println(eleman1);//23

        //ArrayList'teki spesific bir eleman nasıl degistirilir?
        ages.set(7,111);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 111]

        //ArrayList'te bir eleman vsr mı yok mu kontrol etmek için
        boolean r1=ages.contains(99);
        System.out.println(r1);//true

        //Bir ArrayList'i boş olup olmadığını kontrol etmek için
        boolean r2 = ages.isEmpty();
        System.out.println();//false


        //Example 1: Bir List'in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new  ArrayList<>();
        names.add("Azad");
        names.add("İbrahim");
        names.add("Şeval");
        names.add("Velat");

        //1.way

        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }


        //2.way
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }



    }



}
