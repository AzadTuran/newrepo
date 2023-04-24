package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

      /*
          -Javada farkli data type'lari arasinda islem yapiliyorsa
           sonuc uyuk olan data type'inin turunde olur
          - Karsilastirma operatorlerinde sonuc hep boolean doner
         < Kucuktur
         >  Buyuktur
         == Esittir
         != Esit Degildir
         <= ucuk Esittir
         >= Buyuk Esittir
         && and (ve) operatoru
         ||  or (veya) operatoru
    */







    public static void main(String[] args) {

        System.out.println(4*(5+2)/3); //9
        System.out.println(6*16/8); //12

        double sonuc = 4*(5+2)/3;
        System.out.println(sonuc);//9.0

        double sonuc2 = 4.0*(5+2)/3;
        System.out.println(sonuc2);//9.333333333333334

        //büyük olan konteyner tipinde cevap çıkar her zaman

        int sayi1 = 5;
        int sayi2=2;
        double sayi3=2;

        System.out.println(sayi1/sayi2); //2
        // 2.5 normalde ama int/int=int olacağı için tamsayi kısmı alınır virgülden sonrası atılır

        System.out.println(sayi1/sayi3);//2.5
        System.out.println(sayi1+sayi3/sayi2);//6.0

        boolean first = 2<4;
        System.out.println("first = " + first);//true
        boolean second = 2+6 !=8;
        System.out.println("second = " + second);//false
        boolean third = 2+3*5<20;
        System.out.println("third = " + third);//true

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true












    }
}
