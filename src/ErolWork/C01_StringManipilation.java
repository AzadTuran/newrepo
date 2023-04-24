package ErolWork;

public class C01_StringManipilation {
    public static void main(String[] args) {
        /*
        K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
                karakter sayısının toplamını yazdırınız.
                Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
         */

        harfToplam();
        harfToplam2();


    }

    public static void harfToplam(){
        String input1 = "Ali Can" , input2 = "Merve Star", input3= "Mark Tom";

        String input1new = input1.replace(" ","");
        int i1 = input1new.length();
        String input2new = input2.replace(" ","");
        int i2 = input2new.length();
        String input3new = input3.replace(" ","");
        int i3 = input3new.length();

        System.out.println(i1+i2+i3);
    }

    //2.yol

    public static void harfToplam2(){
        String input1 = "Ali Can" , input2 = "Merve Star", input3= "Mark Tom";

        String input1new = input1.replaceAll("[^A-Za-z0-9]","");
        int i1 = input1new.length();
        String input2new = input2.replaceAll("[^A-Za-z0-9]","");
        int i2 = input2new.length();
        String input3new = input3.replaceAll("[^A-Za-z0-9]","");
        int i3 = input3new.length();

        System.out.println(i1+i2+i3);

        //3.yol
        String isim1 = "Ali Can";
        String isim2 = "Aliye Canan";
        String isim3 = "Aliyev Can Cananov";
        Integer c1 = isim1.replaceAll("\\s","").length();
        Integer c2 = isim2.replaceAll("\\s","").length();
        Integer c3 = isim3.replaceAll("\\s","").length();
        System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi: " + (c1 + c2 + c3));

}
    }
