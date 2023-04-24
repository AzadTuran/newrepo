package Introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamaklı bir sayının ilk 2 ve son 2 basamagındaki
        //rakamların toplamını yazdıran kodu yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 5 basamaklı bir sayi giriniz : ");
        int number = scan.nextInt();

                // bir sayinin son rakamini alabilmek için o sayiyi 10'a bolup kalani alırız.
               // Java'da bir "tam sayiyi" baska bir "tam sayiya" bolerseniz sonuc kesinlikle "tam sayi" olur.
              // Java sonucu nasil tam sayi yapar? Ondalikli kismi iptal eder, java yuvarlama yapmaz.
             // bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolup kalani almaliyiz
            //% ==>modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumundan kalani verir
           //dolayisiyle %10 her zaman bize birler basamaginda bulunan sayiyi verir.
          // bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tam sayi yapar
         //java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        // dolayisiyle bir tam sayiyi 10'a bolersek birler basamagini silmis oluruz

        int besincisayi = number%10; //bir sayının 10 ile modunu almak o sayının 10 ile bölümünden kalanı verir. "Yani burda sonuc 12345%10=5 tir."
        number=number/10;
        int dorduncusayi = number%10;
        number=number/10;
        int ucuncucsayi = number%10;
        number=number/10;
        int ikincisayi = number%10;
        number=number/10;
        int ilksayi = number%10;
        number=number/10;

        System.out.println(ilksayi+ikincisayi+dorduncusayi+besincisayi);







    }
}
