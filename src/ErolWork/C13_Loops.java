package ErolWork;

public class C13_Loops {
    public static void main(String[] args) {
        /*

        Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        String s = "Christmas";

         */

        String s = "Christmas" ;

        //ilk m'nin indexini alıp sonra for veya substring ile o karaktere kadar olanları alırız.

        System.out.println(s.substring(0, s.indexOf('m')));


    }
}
