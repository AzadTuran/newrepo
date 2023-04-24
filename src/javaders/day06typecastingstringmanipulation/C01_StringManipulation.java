package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String a = "Tek Rakibim Dunku Ben .";
        // *********** "toUpperCase()" ***********
        String aUpper =  a.toUpperCase();
        System.out.println("aUpper = " + aUpper); //TEK RAKİBİM DUNKU BEN .

        // *********** "toLowerCase()" ***********
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);//tek rakibim dunku ben .

        // *********** "charAt()" ***********
        System.out.println(a.charAt(0));//T
        System.out.println(a.charAt(10));//m

        // a String'deki bastan ikinci ve sondan üçüncü karakteri alınız ve yan yana yazdırın.

        char firstchar = a.charAt(1);//e
        char secondchar = a.charAt(20);//n

        System.out.println("sonuc : " + firstchar+secondchar);//en



        // *********** "lenght()" ***********

        // a stringdeki karakter sayisini bulunuz

        System.out.println(a.length());//23




        //*********** "substring()" ***********

        //a string deki ilk 4 datayi alınız.

        System.out.println(a.substring(0,4));// 0 dahil 4 haric yani ilk 0.index,1.index,2.index,3.index alınır.



        // a stringdeki 4.index dahil 7.index hariç yazdiriniz.
        System.out.println(a.substring(4,7));//Rak

        // rakib kelimesini yazdırın
        System.out.println(a.substring(4,9));//Rakib

        System.out.println(a.substring(10));//m Dunku Ben .

        // ************ contains() ***************\\
        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz
        boolean varMi =a.contains("bim");
        System.out.println("varMi = " + varMi);//true

        // ************ startsWith() ***************\\

        // a String'inin "T" harfiyle baslayip baslamadigini kontrol ediniz

        System.out.println(a.startsWith("T"));//true
        System.out.println(a.startsWith("Tek", 6));
        //true  ilk 6 karakateri at; sonrasi "Tek " kelimesiyle basliyor mu ?
        //prefix  baslangic   offset : at gitsin

        // Universite numaralari yil+BolumKodu+GirisSirasi  olarak duzenlenen bir okulda
        //ogrenci Umran'in Hukuk Fakultesinde okuyup okumadini gosteren kodu yaziniz

        /*
        sinif  22   Hukuk  33    bilgisayar  44    Eczacilik  55    Maliye 66
        KimyaMuhendisligi 77  olsun
         */

        String str = "20103301";
        System.out.println(str.startsWith("33", 4));//true






    }
}
