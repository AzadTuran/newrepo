package javaders.day14loops;

import java.util.Scanner;

public class C01_Loops01 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir tamsayinin tekarsiz rakamlarinin toplamini bulunuz.
        //1838 ==> 1+3 = 4

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer : ");
        String s = scan.next();

        // bir karakterin ilk indexi ile son indexi eşitse o sayı tekrarsızdır. eşit değilse tekrarlıdır.

        int sum = 0;

        for (int i = 0; i <s.length() ; i++) {
            String d = s.substring(i,i+1);

            if(s.indexOf(d) == s.lastIndexOf(d)){
                sum = sum + Integer.valueOf(d);
            }
        }
        System.out.println(sum);


        //Bir string deki tekrarlı characterleri ekrana yazdıran kodu yazdırın.
        //Alala ===> la

        String t = "Alala";
        String result = "";

        for (int i = 0; i <t.length() ; i++) {
            char ch = t.charAt(i);

            if(t.indexOf(ch)!=t.lastIndexOf(ch) && !result.contains("" + ch)){
                result = result+ch;
            }
        }
        System.out.println(result);

    }
}
