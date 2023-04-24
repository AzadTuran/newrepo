package javaders.day29collections;

     /*
     ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
     LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
     ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

     LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
     oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
     ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
     Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
      */

      /*

        1)LinkedList'ler node silme ve ekleme'de cok basarılı olduklari için,silme ve ekleme islemlerini coklukla
        yapacagımız zaman LinkedList kullaniniz.

        2)ArrayList'ler indexleri adres gibi kullanir, bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
        Note: Ihtiyaciniz olan collection cogunlukla silma ve ekleme islemleri yapacaksa (muze ziyaretcileri gibi) LinkedList,
        "search"islemleri yapacaksa (Amerika eyaletleri gibi) ArrayList kullanir.

        */


import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Steve");
        s.add("Azad");
        s.add("Muge");
        s.add("Cüneyt");
        s.add("Esra");

        System.out.println(s);//[Steve, Azad, Muge, Cüneyt, Esra]    Verdiğimiz sıraya göre eklemeyi gördük

        s.add(2,"Esen");
        System.out.println(s);//[Steve, Azad, Esen, Muge, Cüneyt, Esra]      İstediğimiz indexe eklemeyi gördük

        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Azad, Esen, Muge, Cüneyt, Esra, Ajdar]  Başa ve sona eklemeyi gördük.

        s.add(0,"Esra");
        System.out.println(s);//[Esra, Kemal, Steve, Azad, Esen, Muge, Cüneyt, Esra, Ajdar]

        s.remove(2); //2.indexteki elemani siler.
        s.remove("Ajdar");//Ajdarı siler
        s.remove();//ilk elemanı siler.
        //s.removeFirst();    bu da ilk elemanı siler ama daha açıktır ne yaptığı
        s.removeFirstOccurrence("Esra"); // ilk esrayı siler
        s.removeLastOccurrence("Esra"); //son esrayı siler.

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */

        String r1 = s.peek(); //ilk elemanı bize verir ama silmez.
        System.out.println(r1);//Kemal
        System.out.println(s);//[Kemal, Azad, Esen, Muge, Cüneyt]

        String r2 = s.poll();//ilk elemanı verir ama siler listeden
        System.out.println(r2);//Kemal
        System.out.println(s);//[Azad, Esen, Muge, Cüneyt]


        /*
        Retrieves, but does not remove, the head (first element) of this list.
       Returns: the head of this list
       Throws: NoSuchElementException – if this list is empty

       Note:peek() ile element() ikisi de ilk elemani silmedene size verir
       Ama peek() list bos oldugunda size null verir, element() ise "hata" verir
         */

        String r3 = s.element();
        //ilk elemanı silmeden size verir aynı peek gibi ama şimdi ikisinin üstünde yazan notlara bakalım
        //peek de diyor ki ilk eleman yoksa null kabul ederim ama element ilk eleman yoksa  NoSuchElementException der.
        // Yani ilk eleman yok der ve hata verir.
        System.out.println(r3);//Azad
        System.out.println(s);//[Azad, Esen, Muge, Cüneyt]

    }

}
