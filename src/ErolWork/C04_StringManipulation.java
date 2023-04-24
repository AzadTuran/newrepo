package ErolWork;

public class C04_StringManipulation {

    public static void main(String[] args) {
        /*
        Bir stringdeki son karakter hariç tüm karakterleri konsolda büyük harfle yazdırın.

         */
        String s = "Java";
        System.out.println(s.toUpperCase().substring(0,s.length()-1));
    }
}
