package javaders.day15loopsarrays;

import java.util.Arrays;

public class C02_Arrays01 {
    public static void main(String[] args) {

        /*
        1) Array javanin "aynı data tipindeki"  "coklu data" depolamak icin olusturdugu bir yapidir.
        2) Array'ler "primitive data type" leri veya "reference" lar ile calışır.
        3) Array'ler "super fast" dir ve "memory'de cok az yer" kaplarlar.

         */

        //Array nasil olusturulur
        String stdNames[] = new String[5];

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null] ==> null'lar String'in default değerleridir.

        //Array'e nasıl eleman eklenir?
        stdNames[0]="Ajda";
        stdNames[1]="Ayhan";
        stdNames[2]="Kemal";
        stdNames[3]="Cüneyt";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames)); //[Ajda, Ayhan, Kemal, Cüneyt, Filiz]

        //Array'deki spesifik bir elemanı nasıl alabiliriz ?

        System.out.println(stdNames[3]);//Cüneyt


        //Example 1: stdNames Arrayindeki her ismin sonuna * koyarak konsola yazdırınız.

        for (int i = 0; i < stdNames.length; i++) { //length Stringlerde parantezli(method),Array'lerde parantezsiz(method değil) kullanilir.

            System.out.println(stdNames[i] + "*");
        }

        //2.way: for-each loop ==> Enhanced(Zenginleştirilmiş) loop
        for (String w : stdNames ){
            System.out.println(w + "*");
        }

        //Example 2 : Bir integer array oluşturunuz. 5 eleman ekleyiniz. Elemanların toplamını bulup konsola yazdırınız.

        int sayılar[] = new int[5];

        sayılar[0]=3;
        sayılar[1]=5;
        sayılar[2]=6;
        sayılar[3]=9;
        sayılar[4]=2;

       int sum = 0;
        for (int i = 0; i < sayılar.length ; i++) {
            sum = sum+sayılar[i];
        }
        System.out.println(sum);

        //2.Way for each

        for(int w : sayılar){
            sum = sum + w;
        }
        System.out.println(sum);

        //Example 2 : Bir char array oluşturunuz. 3 eleman ekleyiniz. Elemanların çarpımını bulup konsola yazdırınız.


        char initials [] = new char[3];
        initials[0] = 'J'; //74
        initials[1] = 'P'; //80
        initials[2] = 'A'; //65

        int carpim = 1;

        for(char w : initials){
            carpim = carpim*w;
        }
        System.out.println(carpim);//384800
        System.out.println(74*80*65);//384800


    }
}
