package practices.b151practices.practices7;

import java.util.Scanner;

public class C01_while {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
       // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz.


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir rakam giriniz : ");
        int sayi = scan.nextInt();

        int sonuc = 1;

        while (sayi!=1){
            sonuc = sayi*sonuc;
            sayi--;
        }
        System.out.println(sonuc);
    }
}
