package team05soruçözümü;

import java.util.Scanner;

public class C03_Örnek9 {
    public static void main(String[] args) {

        /*

        Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.



         */


        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı girin : ");
        double a = scan.nextDouble();

        System.out.print("2. sayıyı girin : ");
        double b = scan.nextDouble();

        System.out.print("yapıcağınız işlemi giriniz : ");
        String işlem = scan.next();

        if(işlem.equals("+") || işlem.equals("toplama") ){
            System.out.println(a+b);
        }else if(işlem.equals("-")){
            System.out.println(a-b);
        } else if (işlem.equals("*")) {
            System.out.println(a*b);
        } else if (işlem.equals("/")) {
            System.out.println(a/b);
        }else{
            System.out.println("Geçersiz bir işlem yaptınız.");
        }


    }

    }

