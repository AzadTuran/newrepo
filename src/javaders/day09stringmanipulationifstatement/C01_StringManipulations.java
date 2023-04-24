package javaders.day09stringmanipulationifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //******************** isEmpty() *********************\\

        /*
        isEmpty(): bosmu dolumu diye bakar
         */

        //Ex: Bir String'in hic karakter icermediğini gosteren kodu yaziniz.

        String str = "";//hiclik
        //1.YOL
        boolean bosMu = str.length()==0;// Javaya 2 islem yaptirdim 1. lenght () kullandim 2.  ==0 kullandim
        System.out.println("bosMu = " + bosMu);//true

        //2.YOl
        boolean bosMu2 = str.isEmpty();//Javaya 1 islem yaptirdik isEmpty () kullandik
        System.out.println("bosMu2 = " + bosMu2);//true

        //**********************************************************************************************************

        // Ex : Bir String datanin space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz
        String str2 = "  ";


        //1 .Yol
        boolean result = str2.replace(" ","").length()==0;//javaya 3 islem yaptirdik
        System.out.println("result = " + result);//true

        //2.Yol
        boolean result2 = str2.replace(" ","").isEmpty();//javaya 2 islem yaptırdık
        System.out.println("result2 = " + result2);


        //******************************************************************************************************

        // Ex : Bir String datanin yildiz haric hicbir karakter icerip icermedigini gosteren kodu yaziniz.
        String str3 = "*";

        boolean result3 = str3.replace("*","").isEmpty();
        System.out.println("result3 = " + result3);

        //************************ isBlank() **************************************
        /*
        isBlank() methodu String bir data da space + hiçlik icin true döndürür.
                 String datanin bos mu dolu mu olduğunu kontrol eder. Boolean bir deger dondurur.
                 isEmpty den farkli olarak variable'da sadece space varsa bos mu dolu mu diye soruldugunda
                 isBlank == Bos der
                 isEmpty == Bos degil der
         */
        // String str2 = "  ";
        boolean rslt3 = str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true

        boolean rslt4 = str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//false

        

        //************************  indexof() ****************************************

        /*
        indexOf() verilen karakter ve karakterlerin ilk gorunumunu indexini verir.
        tekli karakter icinde, coklu karakter icinde kullanilir
         */
        
        // Ex : Bir String de a ,i ,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String r = "Java is easy to Learn";

        int indexa = r.indexOf('a');//1
        int indexi = r.indexOf('i');//5
        int indexe = r.indexOf('e');//8
        int indexSum = indexe+indexa+indexi;
        System.out.println("indexSum = " + indexSum);//14









    }
}
