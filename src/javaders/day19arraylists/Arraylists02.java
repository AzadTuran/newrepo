package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;
public class Arraylists02 {
    public static void main(String[] args) {

         /*

        Bir method'u ogrenirken asagidaki 3 seyi ogrenin;
        1) O method ne iş yapar?
        2) O method nasıl kullanılır?
        3) O method size neyi verir?

        */

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");

        //ArrayList'te bir elemanin "ilk görünümü" nasil silinir ?
        cities.remove("Miami");
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun] ilk Miami silindi

        cities.remove(2);
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun] Barcelona gitti.

        //ArrayList olustururken an basa ArrayList yerine List de yazabilirsiniz. Sebebini Collections konusunda gorecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanini ages List'ten siliniz
        ages.remove((Integer)12);
        System.out.println(ages);//[23, 7, 4]

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);// [Miami]

        //Iki ArrayList'in birbirine eşit olup olmadığini nasil anlarız ?

        List<Character> initials = List.of('a','k','c','d');
        System.out.println(initials); //[a, k, c, d]

        List<Character> letters = List.of('a','k','c','d');
        System.out.println(letters); //[a, k, c, d]



        //Iki ArrayList'in birbirine eşit olup olmadıgını nasıl anlarız ?
        boolean r1 = initials.equals(letters);
        System.out.println(r1); //true

        int r2 = initials.indexOf('k');//1

        //Example 1: Bir listteki tekrarsız elemanları console'a yazdiran kodu yaziniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for(Double w: prices){
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.println(w + " ");
            }
        }

        //Example 2: Bir listteki tekrarlı eleman olup olmadığını gösteren kodu yaziniz.
        List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        int counter =0;
        for(Double w: heights) {

            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;
            }
        }
        System.out.println(counter);

        if(counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }









    }
}
