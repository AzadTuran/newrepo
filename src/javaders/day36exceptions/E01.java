package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
    1)Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Rxception" denir.

    ***ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
       "Runtime Exception" a ornektir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.

    ***FileNotFoundException, IOException "Compile Time Exception" a ornektir. "Compile Time Exception" lara "Checked Exception" da denir.

    3)FileNotFoundException: Java'ya bir dosyayi bul dediğimizde, Java "dosyanin adresini" ve "dosyanin varliği" konusunda
    hata olursa ne yapmasi gerektiğini soylememizi ister.

    4)IOException: "IO" Input Output demektir.
                 Note: IOException,FileNotFoundException'in parent'idir.

    5)Java da hata'lar temelde 2'ye ayrılır.
    i)Exception'lar
    ii)Error'lar :
     a--StackOverflow Error
     b--Out Of Memory Error
     c--Virtual Machine Error

     //Exception' lar hendle edilebilir hatalardir.Lakin Error'lar asla handle edilemezler

     */
    public static void main(String[] args) throws IOException {

        //1. Way: Exception'i method signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/day36exceptions/TextFile");

        int i = 0;

        while ((i = fis.read()) != -1) {
            System.out.print((char) i);

        }

    }
}
