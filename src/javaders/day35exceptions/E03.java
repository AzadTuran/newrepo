package javaders.day35exceptions;

public class E03 {
    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));
    }
    //Example 1 : Bir String'i Integer'a ceviren ve bu Integer'i String'in length'ine bolen method olusturunuz.


    public static int convertStringToIntDivideByLength1(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }
        return result;
    }

    public static int convertStringToIntDivideByLength2(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    public static int convertStringToIntDivideByLength3(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println("Jump");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

        /*

          valueOf() bos String'de de NumberFormatException hatasi verir
          Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.

         Bir methodta birden fazla hata olabilir bu hatalara cozum icin hata sayisi kadar catch kullaniriz
         ve catch in icine cozumlerimizi ya da mesajimizi yazariz.

       */

        /*
        MY NOTES
        1)valueOf() bos String'de de NumberFormatException hatasi verir
        2)Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
        3)valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
        4)"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
        5)Excaption'a ozel durumlarda farkli "catch block"lar kullanmamiz gerekebilir
        6)"catch block"lar arasinda parent-child iliskisi varsa child yukarida parent asagida olmalidir.
        Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur
        7)"Exception Class" tum exception classlarin parent'idir.


        */


        /*
        SULEYMAN'S NOTES
        1)try block'dan sonra coklu catch block kullanilabilir.
          catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
          catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir.

        2)"Exception Class" tum Exception'larin parent'idir.
          Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
          tek catch block'i "Exception Class" ile kullanabilirsiniz.

        3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz.

        4) "try" catch block olmadan kullanilabilir mi?
           "try + finally" olabilir.
         */
    }
}
