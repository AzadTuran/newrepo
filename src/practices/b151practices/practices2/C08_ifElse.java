package practices.b151practices.practices2;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {
        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Hizmet yılınızı giriniz : ");
        int hizmetYili = scan.nextInt();
        System.out.print("Maaşınızı giriniz : ");
        int maas = scan.nextInt();

        if(hizmetYili>=5){
            System.out.println("Zamlı maaşınız : " + (maas+(maas*10/100)));
        }else {
            System.out.println("Zam alabilmek için " + (5-hizmetYili) + " yil daha çalışmalısın.");
        }

    }
}
