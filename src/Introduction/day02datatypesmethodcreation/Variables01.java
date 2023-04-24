package Introduction.day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {
        /*
        Java'da temelde iki tip data vardir
        1)primitive data type:
          char,boolean,byte,short,int,long,float,double
        2)non-primitive data type:
          String
         */


        /*
        Note1: primitive data type'larini java oluşturmuştur,biz oluşturamayiz.
        Note2: primitive data type'larin isimlerinde sadece kücük harf kullanilir.
        Note3: primitive data'lar type'lerine memory'de farkli farkli yer kaplarlar.
        Note4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
         */

        /*
            non-primitive data types:
     1)Ornegin  String non-primitive bir data type ornegidir
     2)Uretilen her bir class ayni zamanda bir "non-primitive data type"dir.
     Bu yüzden "non-primitve data type"lar sinirsiz sayidadir
     3)Non-primitive data type'larin isimleri buyuk harf ile baslar
     4)Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir
     */

        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String cityName = "Ankara";
        System.out.println(cityName);
        int a = 13;

        /*
        ----------------------------------------------------------------------------------------------
        Interview sorusu: "primitive" ve "non-primitive " data type'lar arasindaki fark nedir?
        1)"primitive"ler sadece bizim atadigimiz degeri icerir;
          "non-primitive" ler bizim atadigimiz deger ve methodlar icerir
        2)"primitive"ler kucuk harfle baslar, "non-primitive" ler buyuk harf ile baslar
        3)"primitive"leri java uretmistir 8 tanedir
          "non-primitive"leri  java ve developerlar uretebilir bu yuzden sinirsiz sayidadir
        4)"primitive" ler memory de data type'ina gore yer kaplar
          "non-primitive" ler icin java memory'de hep ayni buyuklukte yer ayirir.
        -----------------------------------------------------------------------------------------------
 */


    }
}
