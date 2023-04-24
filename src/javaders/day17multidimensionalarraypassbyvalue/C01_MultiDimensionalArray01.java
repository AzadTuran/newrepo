package javaders.day17multidimensionalarraypassbyvalue;
import java.util.Arrays;
public class C01_MultiDimensionalArray01 {
    public static void main(String[] args) {
        /*
       1-Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.

        */


        //"Multidemansional Array"nasil olusturulur?
        String names[][] = new String[3][2];

        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //Multidimensional Array"leri console'a yazdirmak icin "toString()"method'u degil "deepToString()"methodunu kullaniniz.
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

        //Multidimensional Array icindeki bir array'i yazdirmak.
        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1])); //[P, M]

        // Multidimensional Array icinden spesifik bir eleman nasil yazdırılır ?
        System.out.println(names[1][1]); //M


        //Kısa yoldan Multdimensional Array nasil oluşturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Example 1 : Yukarıdaki student array toplam kaç isim barındırır.

        int sum = 0;

        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum);

        //*****************************************************************************************


        //Example 2 : Yukarıdaki students array'in içinde "m" olan isimleri console'a yazdiriniz.
        //ilk for arrayleri ayırır ve alır 2. for ise arrayin içindeki stringleri ele alır.

        for(String[] w : students ){
            for(String k : w){
                if(k.contains("n")){
                    System.out.println(k);
                }

            }
        }


        //*****************************************************************************************

        //Example 3 : Bir integer Array içindeki tüm elemanları çarpın.
        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};

        int carpim = 1;
        for(int[] w : nums){
            for (int s : w){
                carpim=carpim*s;
            }
        }
        System.out.println(carpim);

        //*****************************************************************************************

        //Müthiş bir soru iyi anla tekrar et!!!!!!!!!!!

        //Example 4 : Ikı boyutlu bir array'i tek boyutlu bir array'e çeviriniz.
        int numbers[][] = { {5, 4}, {2, 3, 2}, {7}}; //==> {5,4,2,3,2,7}

        //1.Step: İki boyutlu array'de kac eleman oldugunu bulan kodu yazmalıyız.

        int toplamEleman = 0;
        for(int[] w : numbers){
            toplamEleman = toplamEleman + w.length;
        }

        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmalıyız.
        int newArr[] = new int[toplamEleman];

        //3.Step: Iki boyutlu array'deki elemanları tek boyutlu array'e transfer etmeliyiz.
        int index = 0;

        for(int[] w : numbers){
            for(int k : w){
                newArr[index] = k;
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));


        //*****************************************************************************************

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];
        // { {15, 4}, {12, 43, 21} }
        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);



    }
}

