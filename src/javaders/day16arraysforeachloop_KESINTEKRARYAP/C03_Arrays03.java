package javaders.day16arraysforeachloop_KESINTEKRARYAP;

import java.util.Arrays;

public class C03_Arrays03 {
    public static void main(String[] args) {
       // Size verilen bir cümlede kac kelime olduğunu gösteren kodu yazınız.

        String s = "Java is easy . Learn Java earn money. ";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy, ., Learn, Java, earn, money.]
        System.out.println(words.length); //8

        // split() methodu tüm boşluklardan keser.


        // Size verilen bir cümlede kac harf oldugunu gösteren kodu yazınız.

        String letters[] = s.replaceAll("[a-z,A-Z]","").split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);
    }

}
