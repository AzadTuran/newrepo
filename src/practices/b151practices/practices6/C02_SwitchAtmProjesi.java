package practices.b151practices.practices6;

import java.util.Scanner;

public class C02_SwitchAtmProjesi {
    public static void main(String[] args) {
         /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-4 Arasi Islem Numaranizi Giriniz \n"+
                "Işlem 1: Bakiye Sorgulama \n"+
                "Işlem 2: Para Cekme \n"+
                "Işlem 3: Para Yatırma \n"+
                "Işlem 4: İşlemi Sonlandır");

        int islemNo = scan.nextInt();
        int bakiye = 1000;

        switch (islemNo){

            case 1 ://bakiye sorgulama yapıcaz.
                System.out.println("Bakiyeniz : " + bakiye + " TL'dir.");
                break;
            case 2 : //Para çekme
                System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                int cekmekistenilenmiktar = scan.nextInt();
                if(cekmekistenilenmiktar>bakiye){
                    System.out.println("Bakiyeniz yetersiz. ");
                }else{
                    bakiye = bakiye-cekmekistenilenmiktar;
                    System.out.println("Hesabınızdan " + cekmekistenilenmiktar + "TL çektiniz.");
                    System.out.println("Yeni bakiye : " + bakiye + " TL");
                }
                break;
            case 3 ://Para yatırma
                System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                int yatirilacaktutar = scan.nextInt();
                System.out.println("Hesabınıza " + yatirilacaktutar + " TL eklendi.");
                System.out.println("Yeni bakiye " + (bakiye+yatirilacaktutar) + " TL'dir.");
                break;

            case 4 : //İşlemi sonlandır.
                System.out.println("İşleminiz sonlandırılmıştır. Son bakiye : " + bakiye + " TL'dir." );
                break;

            default:
                System.out.println("Geçerli bir numara giriniz.");



        }

    }
}
