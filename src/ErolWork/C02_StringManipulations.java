package ErolWork;

public class C02_StringManipulations {
    public static void main(String[] args) {
        /*
        B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        toplamını bulunuz.

         */

        String input  = "Erol Işıldak";
        char ilk = input.charAt(0);
        char son = input.charAt(input.length()-1);

        System.out.println(ilk+son);



    }
}
