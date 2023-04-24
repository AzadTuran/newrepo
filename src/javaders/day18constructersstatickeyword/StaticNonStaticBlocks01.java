package javaders.day18constructersstatickeyword;

   /*
   1)"static blocl"lar "static variable"lara "ilk degerlerini atamak" (initialize) icin kullanılır.
   2)"static" bir variable'a deger atamak icin kod yazmanız gerekirse "static block" kullanınız.
   3)"static" bir variable'a deger atamak icin yazilmış kod main method icine de yazılabilir ama
    "static block" icine yazilan kod "main method" icine yazilan kod'dan önce çalıştırılır.
   4)Bir class'da birden fazla static block varsa üstteki önce çalıştırılır.

   */

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {

    //static variable 'lar "static block" kullanılmadan da "initialize" edilebilirler.
    public static double pi = 3.14;

    //static variable 'lar "static block" kullanılarak da "initialize" edilebilirler.
    //Asagıdaki gibi "static" bir variable'a deger atamak icin kod yazmanız gerekirse "static block" kullanınız.
    public static double price ;

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }

    static {
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }
    }
    static {
        System.out.println("Hey I am a static block 2");
    }

}
