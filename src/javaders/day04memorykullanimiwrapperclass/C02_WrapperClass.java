package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
    /*

    Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran primitve data typelarinin non primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,dürüm) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****
*/


    public static void main(String[] args) {
        byte primitiveByte = 12;
        Byte wrapperByte = 12;


        //primitiveByte. dediğimde herhangi bir method çıkmıyor ama
        //wrapperByte. dediğimde bir sürü method çıkar karşımıza zaten wrapper ın amacı bu.


        // byte data type'inin en buyuk ve en kucuk degerini ekrana yazdirin.

        byte min = Byte.MIN_VALUE;
        System.out.println("min = " + min);

        byte max = Byte.MAX_VALUE;
        System.out.println("max = " + max);


        // int data typenin maximum değeri ile byte data typenin min değerinin toplamini hesaplatan methodu olusturunuz.
        int maximum = Integer.MAX_VALUE;
        byte minimum = Byte.MIN_VALUE;
        System.out.println("max + min = " + (minimum + maximum));


        //******************** Primtive Data Type'larini Wrapper Classlara Nasil Ceviririz ********************
        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat; // buna Autoboxing denir == Otomatik Kutulama
        // Java bunu otomatik yapar kucuk kutuyu buyuk kutuya yerlestirir

        //******************** Wrapper Classları Primitive Data Type'larina   Nasil Ceviririz ********************
        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;// buna Unboxing denir.
        // kucuk kutuyu buyuk kutudan cikarma Java bunuda otomatik yapar

        // Ex Verilen iki String datanin toplamini veren kodu yaziniz

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1 + str2);//12345678
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

         //valueOf() ==> String bir datayı Integer a donüstürür.

        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar.
        İki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir.
        Buna "Concatination" denir.

         */
        System.out.println();



        String harf = "A";
        int sayi = 7;
        //harf + sayi==> A7



        // "K"+3*5/2 ==> sonucu ne olur yazdirin.

        String a = "K";
        int b = 3, c=5, d=2;

        System.out.println(a+b*c/d); //K7 yazdirir.


    }
}




