package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
       // Kullanıcıdan adresi alın ve ekrana yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen adresinizi giriniz : ");
        String adres = scan.nextLine();

        System.out.println("Adresiniz : " + adres);

    }
}
