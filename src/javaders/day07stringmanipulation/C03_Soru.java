package javaders.day07stringmanipulation;

import java.util.Scanner;

public class C03_Soru {
    public static void main(String[] args) {
        /*Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu  i) En az 8 karakterden olussun\n" +
                "        ii)Password space icermesin\n" +
                "        iii)En az 1 tane buyuk harf olsun\n" +
                "        iv) En az 1 tane kucuk harf olsun\n" +
                "        v) En az 1 tane sembol olsun\n" +
                "        vi) En az 1 tanede rakam olsun\n" +
                "şeklinde giriniz.  ");

        String password = scan.next();

        boolean first = password.length()>7;
        boolean second =!password.contains(" ");



    }
}
