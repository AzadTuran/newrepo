package Introduction.day01variablesl;

public class Variables01 {

    public static void main(String[] args) {

        //java  okumaz bu satiri. Kendimize veya baskasina aciklamidir.

       /*
       java bu satirlari da okumaz.
        */

            //Variable olusturma
            //data type + variable name + atama operatoru + data + noktali virgul
            int            age               =              21         ;

            //java cumlesi ==> Statement
            //Data type + Varibale Name ==> Variable Declaration
            //Assignment Operator(atama operatoru) + Variable degeri ==> Assignment
            //Eger variable Declaration yapar, assignment yapmazsaniz Java kendi degerlerini (default==>varsayilan) koyar
            //Default degerler sayilar icin sifirdir.
            //Dilbilgisindeki nokta ne ise java daki noktali virgul ayni seydir. ve statementin bittigini gosterir
            //java da esittir demek "==". Yani Matematik te "=", java da "=="

        /*
            Java da temelde iki tip data vardir.
            1)primitive data type:
                char, boolean, byte, short, int, long, float, double
            2)non-primitive data type:
                String
        */

            //Ornek 1: Ogrenci ismi icin variable olusuturup deger olarak Ali Can atayiniz
            //String'lere verilen degerler daima cift tirnak icinde olmalidir
            String studentName = "Ali Can" ;

            //String bir variable olusturup ona her hangi bir atama yapmazsak java o variable a
            //default olarak "null" koyar
            //null demek 0 demek degil, 0 da coding te bir degerdir
            //null demek ici bos obje demektir.
            //yani icinde variable veya method bulunmayan default obje demektir
            // {}

            //char data type:
            //Tek karakterler icin kullanilir. ornegin ==> A, x, ?, 5
        //Ornek 2 : char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note: char data type'inda degerler tek tirnak icine konulmalidir
        char isminIlkHarfi = 'A' ;

        //boolean data type:
        //boolean lar iki farkli deger alabilirler true (dogru) veya false (yanlis)
        //Ornek 3: boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false ;

        //byte data type:
        //tam sayilar icindir. hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil) kadar tamsayi degerleri icin kullanilabilir
        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir ve hafizada 2 byte yer kaplar
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        short okuldakiOgrenciSayisi = 1300;

        //int data type:
        //tam sayilar icindir. hafizada 4 byte yer kaplar
        //int :-2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5:ulke nüfusu icin bir variable olusturunuz ve deger atamasi yapiniz.
        int countryPopulation =1500000;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 6: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        //Note:Bir deger long ise sonuna 'L' (tercih edilir) yada 'l' konulur.
        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna 'L' koyamaya gerek yok
        //Long dememize ragmen sonuna eger L koymazsak java onu eger int araliginda ise int olarak kabul eder
        long cellNumberInHumanBody = 787445446841L;
        long weight = 1234565;//int'lerin araliginda ise sonuna 'L' koyamaya gerek yok
        //float data type:
        //float virgullu sayilar (Decimal numbers==> ondalikli sayilar) icin kullanilir
        //fiyatlandirmalar icin tercih edilebilir (12.99)
        //Ornek 7: Gomlek ve ayakkabi fiyatlari icin iki tane varibale olusturup toplam fiyati ekrana yazdiriniz.
        //Note: java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder
        //      siz data type'ini float yazarsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" yada "f" koymalisiniz
        //      float memory de 4 byte yer kaplar, double 8 byte yer kaplar
        float gomlekFiyati = 12.99F;
        float ayakkabiFiyati = 15.99F;
        System.out.println(gomlekFiyati + ayakkabiFiyati);
        //     System.out.println(); kodu parantez icine yazdiklarimiz ekrana yazdirir.
        int a = 12;
        int b = 13;
        System.out.println(a+b);
        // System.out.println(); ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        // System.out.print(); ekrana yazdirir ve "pointer" i ayni satirda tutar.
        int c =313;
        int d =314;
        System.out.print(c);
        System.out.print(d);
        //double data type:
        //double memory de daha fazla yer kaplar, virgulden sonraki rakam daha fazla alir
        //double virgullu sayilar (Decimal numbers==> ondalikli sayilar) icin kullanilir
        //ornek 8: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturunuz ve agirliklari farkini ekrana yazdiriniz
        double weightCell = 0.000000000000000112;
        double weightAmip = 0.000000000000000023;
        // System.out.println(); yazdirmanin kisa yolu sout yazini enter a basin
        System.out.println(weightCell - weightAmip );











    }

    }

