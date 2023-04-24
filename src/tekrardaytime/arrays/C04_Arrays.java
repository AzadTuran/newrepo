package tekrardaytime.arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //Size verilen bir cümlede kaç kelime oldugunu bulan kodu yazınız.

        String s = "Java is easy. Learn Java earn money.";

        String words [] = s.split(" ");//split boluklardan keser ve arraye yerleştirir.

        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length);//7

        String s1 = "Java is easy. Learn Java earn money.";


    }
}
