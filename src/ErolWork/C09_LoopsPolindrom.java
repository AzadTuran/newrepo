package ErolWork;

public class C09_LoopsPolindrom {
    /*

    B!r Str!ng ‘ !n pal!ndrom olup olmadıgını kontrol etmek !ç!n kod yazınız. B!r Str!ng, ters! !le
    aynıysa, buna pal!ndrom den!r. Örneg!n; “anna”, “123321” pal!ndromlardır.

     */

    public static void main(String[] args) {

        String a = "anna";
        String bos = "";

        for (int i = a.length()-1; i >=0 ; i--) {
            String b = a.substring(i,i+1);

            bos+=b;
        }


        boolean sonuc = a.contains(bos);
        System.out.println(sonuc);



    }
}
