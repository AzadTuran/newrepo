package javaders.day07stringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String s = "Learn Java earn money";


        //********************* endsWith() ************************\\
        /*  endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir.
                        True yada false seklinde boolean bir deger dondurur.
                        Icerisine tek karakterde coklu karakterde koyabilirsiniz
        */
        //örnek: s String'inin  "money" ile bitip bitmediğini kontrol ediniz.
        
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true

        /*
            contaisn () methodu cumlenin herhangi bir yerinde istenilen datayi bulursa true dondurur.
            ancak task'in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin endsWith () methodu kullanmaliyiz.
       */



        //********************* replace() *********************************\\

        // örnek: s String'deki "money" kelimesini "dollar" kelimesiyle yer degistirelim.

        String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar.
        
        
        //örnek2: s String'deki "earn" kelimesini "win" kelimesine çeviriniz.
        
        String s2 = s.replace("earn","win");
        System.out.println("s2 = " + s2);//s2 = Lwin Java win money
        //gördüğü her earn lafını değiştirir bu yüzden learn deki earn de win olur ve lwin çıkar ortaya
        
        
        //örnek3: s string'deki a "harfini" "*" ile degistiriniz. 
        
        String s3 = s.replace('a','*');
        System.out.println("s3 = " + s3); //s3 = Le*rn J*v* e*rn money
        // burdada char şeklini kullandık çift tırnak da kullanabilirdik ama daha çok yer kaplar. 


        //örnek3: s string'deki L "harfini" "***" ile degistiriniz.
        
        String s4 = s.replace("L","***");
        System.out.println("s4 = " + s4);//s4 = ***earn Java earn money
        
        //örnek4: s string'deki e harflerini siliniz.
        
        String s5 = s.replace("e","");
        System.out.println("s5 = " + s5);//s5 = Larn Java arn mony
        
        //örnek 5:  s string'deki earn harflerini siliniz.
        
        String s6 = s.replace("earn", "");
        System.out.println("s6 = " + s6);//s6 = L Java  money


        String t = "Dolma kalem";
        //örnek 6: kalem yerine biber yazdirin.

        String t1 = t.replace("kalem","biber");
        System.out.println("t1 = " + t1);//t1 = Dolma biber

        // ********************* trim () ***************\\

        /*

        trim ()  Bir String'de bastaki ve
        sondaki space karakterlerini siler .
        Ortadaki space karakterlerine dokunmaz
         */

        String isim = "   Mehmet Fatih Yildirim  ";
        // EX : isim String'indeki varsa bas ve sondaki space'leri siliniz
        System.out.print("********************");
        System.out.print(isim);
        System.out.print("********************");
        String trimIsim = isim.trim();
        System.out.print("trimIsim =" + trimIsim);
        System.out.print("********************");


        // örnek: asagıda verilen urunlerin toplam fıyatini buunuz.
        String tv = "599.99$";
        String laptop = "299.99$";


        String tv2 = tv.replace("$","");//$ gordugu yere hicbir şey koyma yani $ sembolünü sil
        System.out.println("tv2 = " + tv2);

        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);
        
        Double totalprice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalprice = " + totalprice);//totalprice = 899.98















    }

}
