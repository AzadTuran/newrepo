package practices.b151practices.practices2;

import java.util.Scanner;

public class C04_Dikdörtgen {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dikdörtgenin kısa kenarını giriniz : ");
        int a = scan.nextInt();
        System.out.print("Lütfen dikdörtgenin uzun kenarını giriniz : ");
        int b  = scan.nextInt();
        
        int çevre = 2*(a+b);
        System.out.println("çevre = " + çevre);
    }
}
