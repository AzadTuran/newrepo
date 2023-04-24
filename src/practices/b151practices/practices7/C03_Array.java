package practices.b151practices.practices7;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız.


        Scanner scan = new Scanner(System.in);//Kullanıcıdan veri almak için

        int rakamlar[] = new int[4];//4 rakam olacağı için 4 rakamlık bi array oluşturduk

        for (int i = 0; i <4 ; i++) { //rakamları tek tek alıp arraya eklemek için döngü açtık
            System.out.println("Rakam giriniz : ");
            int rakam = scan.nextInt();
            rakamlar[i]=rakam; //kullanıcıdan aldıgımız her rakamı sırasıyla array'e ekledik.
        }

        System.out.println("Array'in kendisi = "+Arrays.toString(rakamlar));

        //***ŞİMDİ Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız. BUNU YAPICAM ***



        int toplam = 0;

        for (int w : rakamlar) {
            toplam=toplam+w;
        }

        System.out.println("Array'deki elemanların toplamı = " + toplam);

        double ortalama = toplam/rakamlar.length;
        System.out.println("Ortalama = " + ortalama);


        //Şimdi son kısmı yapıcam
        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız.

        for(int w:rakamlar){
            if(w>ortalama){
                System.out.println("Ortalamadan büyük elemanlar : " + w +" ");
            }
        }









    }
}
