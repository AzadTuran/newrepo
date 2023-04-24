package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Lambda01 {
    public static void main(String[] args) {
        //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz.

        List<String> iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));

        buyukHarfUzunlukArtanTekrarsız(iller);
        System.out.println();
        buyukHarfSonHarfArtanTekrarsız(iller);


    }//main


    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz.
    public static void buyukHarfUzunlukArtanTekrarsız (List<String> iller){
        System.out.print("1) ");
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }



    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void buyukHarfSonHarfArtanTekrarsız(List<String>iller){
        System.out.print("2) ");
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfLegthArtanDistinctLengthAlfabetikSira(List<String> iller){

        iller.stream().
                distinct().
                map(String::toUpperCase).//Method referance
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).//Once uzunluklarina gore siraladik.thenComparing() ile natural order'a gore siraladik
                forEach(System.out::println);//Lambda expression'da ==> forEach(t -> System.out.print(t + " ")); seklinde yazilir
        //Method Referance() ==> forEach(System.out::println); seklinde yazilir


    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.









}//class
