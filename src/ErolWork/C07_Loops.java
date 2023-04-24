package ErolWork;

public class C07_Loops {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
        ardısık tam sayı arasında bosluk bırakarak yazınız.

         */

        for (int i = 11; i <= 120; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println(" ");

        int sayi = 120;
        while (sayi >= 11) {
            if (sayi % 4 == 0 && sayi % 6 == 0) {

                System.out.print(sayi + " ");


            }

            sayi--;

        }
    }
}
