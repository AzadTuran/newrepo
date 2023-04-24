package team05soruçözümü;

import java.util.Scanner;

public class C04_Örnek10 {
    public static void main(String[] args) {
        /*
        Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI

        BMI Formülü kg/m^2

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu girin : ");
        double kg = scan.nextDouble();
        System.out.print("Boyunuzu m cinsinden girin : ");
        double boy = scan.nextDouble();

        double BMI = kg/(boy*boy);
        System.out.println("Vucüt Kitle Endeksiniz : "+BMI);


        if(BMI<0){
            System.out.println("Geçersiz");
        } else if (BMI<18.5) {
            System.out.println("Zayıf");
        } else if (BMI>=18.5 && BMI<24.9) {
            System.out.println("Normal ağırlık");
        } else if (BMI>=24.9 && BMI<29.9) {
            System.out.println("Fazla Kilolu");
        }else{
            System.out.println("Obezite");
        }


    }
}
