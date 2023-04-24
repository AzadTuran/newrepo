package Introduction.day03scanner;
import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu isteyiniz
        //i) Alanını hesaplayınız.
        //ii) Çevresini hesaplayınız.
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen Bir Dikdörtgenin Kısa Kenar Uzunluğunu Yazınız :");
        double kisaKenar=input.nextDouble();

        System.out.println("Lütfen Bir Dikdörtgenin Uzun Kenar Uzunluğunu Yazınız :");
        double uzunKenar=input.nextDouble();

        System.out.println("Dikdörtgenin Alanı : "+(kisaKenar*uzunKenar));
        System.out.println("Dikdörtgenin Çevresi : "+(2*(kisaKenar+uzunKenar)));
    }
}
