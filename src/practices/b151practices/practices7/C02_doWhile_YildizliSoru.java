package practices.b151practices.practices7;

import java.util.Scanner;

public class C02_doWhile_YildizliSoru {
    public static void main(String[] args) {
          /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.

         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Yüksekliği giriniz : ");
        double h = scan.nextInt();

        int count = 0;
        double toplamYol = 0;


        do{

            toplamYol=toplamYol+h;
            count++;
            toplamYol+=h/2;


            h=h/2;




        }while (h>=1);

        System.out.println(count);
        System.out.println(toplamYol);

    }


}
