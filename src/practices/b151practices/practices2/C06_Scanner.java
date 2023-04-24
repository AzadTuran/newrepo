package practices.b151practices.practices2;

import java.util.Locale;
import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi ve Soyisminizi giriniz : " );
        String isim = scan.nextLine().toUpperCase();

        char isimIlkKarakter = isim.charAt(0);

        char soyisimIlkKarakter = isim.charAt(isim.indexOf(" ")+1);


        System.out.println("" + isimIlkKarakter + soyisimIlkKarakter);





    }
}
