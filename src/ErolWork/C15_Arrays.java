package ErolWork;

public class C15_Arrays {
    public static void main(String[] args) {
        //String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String isim[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        String kısa = "Kemal";
        for (String w: isim) {
            if(kısa.length()<w.length()){
                kısa=w;
            }
            for (String s: isim) {
                if(s.length() ==w.length()){

                }
            }
            //System.out.println(s+" ");

        }



    }
}
