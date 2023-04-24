package team05soruçözümü;

import java.util.Random;
import java.util.Scanner;

public class C01_basitTahminoyunu {
    /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin

         */

    public static void main(String[] args) {
        Random rnd = new Random();
        int iJtuttuğusayi = rnd.nextInt(100);



        int tahmin = 0;
        int tahminsayisi=0;

        while (iJtuttuğusayi!=tahmin){
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir tahminde bulunun :");
            tahmin = scan.nextInt();

            if(tahmin==iJtuttuğusayi){
                tahminsayisi++;

            } else if (tahminsayisi<iJtuttuğusayi) {
                System.out.println("Büyüt");
                tahminsayisi++;
            }else{
                System.out.println("Küçült");
                tahminsayisi++;
            }




        }
        if(tahminsayisi<=3){
            System.out.println("Waoovv");
        } else if (tahminsayisi>=4 && tahminsayisi<=8) {
            System.out.println("Aferin");
        }else{
            System.out.println("Başarısız");
        }


    }

    }


