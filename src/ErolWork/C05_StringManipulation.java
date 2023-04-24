package ErolWork;

public class C05_StringManipulation {
    /*

    B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
    olmadıgını kontrol etmek !ç!n kod yazınız.
    Örnek: ‘Ali   Can’ için konsolda false yazmalıdır.

     */

    public static void main(String[] args) {

        //1.way
        String isim = "Ali    Can";

        if(isim.contains("  ")){
            System.out.println("false");
        }else {
            System.out.println("true");
        }


        //2.way

        if(isim.trim().replaceAll("[A-Za-z]","").length()>1){
            System.out.println("true");
        }



    }


}
