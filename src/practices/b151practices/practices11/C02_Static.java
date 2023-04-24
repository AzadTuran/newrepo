package practices.b151practices.practices11;

public class C02_Static {
     /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
     */

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo  ;
    static boolean okulAcikMi ;


    public static void main(String[] args) {
        //static variable'lara, class icerisindeki tum methodlardan direkt ulaşabiliriz.

        System.out.println(okulIsmi); //Yildiz Koleji
        System.out.println(okulNo);//0 çünkü default değer 0
        System.out.println(okulAcikMi); //false çünkü default deger false

        //////////////////////////////////////////////////////////////

        // static variable'lar gokteki ay gibidir.
        //static variable'lar clas'a bağlıdır.
        // static variable'ın degeri bir kisi tarafından degistirilirse, herkes icin degisiklige ugrar

        okulNo=102;

        System.out.println(okulNo);  // 102


    }

    public static void staticMethod(){
        okulNo = 200;

        System.out.println(okulNo);//200
    }
}
