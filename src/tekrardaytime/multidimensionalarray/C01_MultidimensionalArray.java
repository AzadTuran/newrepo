package tekrardaytime.multidimensionalarray;

import java.util.Arrays;

public class C01_MultidimensionalArray {
    public static void main(String[] args) {
         /*
        1) Bir arrayin elemanlari da array olursa bu tarz array'lere 'mutidimensional array' denir.
         */


        //'Mutidimensional Array' nasil olusturulur.

        String names[] [] = new String[3][2];  // Multidimensional Array'ler cogunlukla ikiden fazla kullanilmaz.

        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        // Multidimansional Array'leri konsola yazdirmak icin toString() methosu degil deepToString () methodunu kullanmaliyiz.
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]


        // Multidimensional Array icinden specific bir eleman nasil yazdirilir?

        System.out.println(names[1][1]);//M


        //Multidminesional array icindeki array'i yazdirmak.
        System.out.println(Arrays.toString(names[0]));//[A, K]

        System.out.println(Arrays.toString(names[1]));//[P, M]


        //Kisa yoldan Multidimansional Array nasil yazdirilir?
        // Kisayol array'de{} ic arrayleri birbirinden farkli sayida ekleyebilirisn
        //  String names[] [] = new String[3][2]; bu gibi stanadrt array'lerde her ic array ayni sayida eleman icerir.

        String students [][] = {{"Ali", "Kemal"},{"Cemal"},{"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};


        //Example 1: Yukaridaki student arrayinde toplam kac tane isim oldugunu bulunuz.

        int sum =0;

        for(String[] w : students){
            sum+=w.length;
        }
        System.out.println(sum);

        // Yukaridaki students arayinde icinde 'm' olan isimleri konsola yazdiriniz.


        for (String[] w: students){

            for (String k : w){

                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //Bir integer multidimensional array olusuturunuz. tum elelmanlarin carpimini hesaplayiniz.

        int nums [][] = {{5,4},{2,3,2},{7}};

        int sum1 = 1;

        for (int [] i : nums){

            for (int z : i){
                sum1*=z;
            }
        }
        System.out.println(sum1);


        //Example 4: Iki boyutlu bir arrayi tek boyutlu bir array'a ceviriniz.

        int numbers [][] = {{5,4},{2,3,2},{7}}; //==> {5,4,2,3,2,7}

        //1.Step Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz.



        int toplamElemanSayisi = 0;

        for (int[] w : numbers){
            toplamElemanSayisi+= w.length;
        }

        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz.
        int newArray[]= new int[toplamElemanSayisi]; // ic ice array oldugu icin for olmadan her birinin icine girip lenght'ini alamayiz.


        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'a transfer etmeliyiz.
        int idx = 0;

        for (int [] w: numbers){

            for (int k :w){
                newArray[idx] = k;

                idx++;

            }
        }
        System.out.println(Arrays.toString(newArray));

        //Example 5: Bir integer multidimansional array'deki en kucuk ve en buyuk elamanin toplamini bulunuz.
        int ages [][] = {{15,4},{12,43,21},{7}};//43+4=47

        int small = ages[0][0];
        int big = ages[0][0];

        for (int[] w :ages){

            for (int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small); //4
        System.out.println(big);//43

        System.out.println(small + big); //47


    }
}
