package tekrardaytime.arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        //1.way
        String names[] = {"K", "C", "R", "A", "S"};

        String eleman = "Ç";

        int counter =0;

        for(String w : names){
            if(eleman==w){
                counter++;
            }
        }

        if(counter>=1){
            System.out.println("Bu eleman array'de var.");
        }else{
            System.out.println("Bu eleman array'de yok.");
        }



        //2.way daha hızlıdır binarySearch()
        Arrays.sort(names);
        int result = Arrays.binarySearch(    names         ,               eleman);
        //                               array ismi              Aramak istediğimiz eleman

        if(result<0){
            System.out.println("Bu eleman array'de yok.");
        }else{
            System.out.println("Bu eleman array'de var.");
        }

        // 1) binarySearch() method hizli arama yapar. Cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        // 2) binarySearch() methodu var olan elemanlar icin  size o elemanin index'ini verir.
        //3) binarySearch() methodundan aldiginiz index 0 veya 0'dan buyuk ise bu elelman array'de var demektir.
        //  "-" isaretinin anlami o eleman yok demektir.
        //  "sayi" ise oeleman olsaydi kacinci eleman olurdu demektir.
    }
}
