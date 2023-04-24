package practices.b151practices.practices2;

public class C03_Ascii {
    public static void main(String[] args) {

        //CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız


        //1.YOL
        System.out.println(("" +(char)67) +  ((char)69) + ((char)77));//CEM

        //2.YOL

        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */
        char charfi = 'B'+1;//C
        char eharfi = 'D'+1;//E
        char mharfi = 'L'+1;//M

        System.out.println(charfi+eharfi+mharfi);//213 verir
        System.out.println(""+charfi+eharfi+mharfi);//CEM verir. Başa bir string attık ki harf olarak algılasın


    }
}
