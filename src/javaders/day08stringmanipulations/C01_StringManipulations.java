package javaders.day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        
        //****************** replaceFirst() **********************\\
        
        /*
        replaceFirst(): replace() ile ayni isi yapmakla birlikte ilk gordügü datayi degistirir.
         */

        String str = "Bizimle Java Ogrenmek Cok Kolay";
        //örnek: str String'indeki il gördüğü "i" harflerinin yerine "e" harfi yerlestiriniz.
        
        String str1 = str.replaceFirst("i", "e");
        System.out.println("sonuc = " + str1);//sonuc = Bezimle Java Ogrenmek Cok Kolay


        String str2 =str.replace("i","e");
        System.out.println("str2= " +str2);//str2= Bezemle Java Ogrenmek Cok Kolay

        
        
        
    }
}
