package SoruÇözümlerim.ArabaKiralama;

import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****************** TechPro Araç Kiralama ******************");
        System.out.println("******************     HOŞGELDİNİZ       ******************");
        MusteriveAracBilgileri.arabalar();
        System.out.println("Lütfen Yukarıdaki Araç Listesinden Bir Araç Seçiniz 0-8 arasında : ");
        int secim = scan.nextInt();
        if (secim>=0 && secim<=8){
            MusteriveAracBilgileri.aracTalep();
        }else{
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-8 arasından bir seçim yapınız.");
        }

    }
}
