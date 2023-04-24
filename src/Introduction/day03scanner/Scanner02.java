package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // Kullanicidan ilk ismini ve soyismini alıp aynı satırda yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("İsminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.print("Soyisminizi giriniz : ");
        String soyisim = scan.nextLine();

        System.out.println(isim + " " + soyisim);

    }


}
