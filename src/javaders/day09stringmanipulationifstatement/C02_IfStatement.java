package javaders.day09stringmanipulationifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

        // INTERWIEW QUESTIONS USA QA

        //Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.
        // String y = "abbccdc"


        String y ="aac";

       char ch = y.charAt(0);
       if(y.indexOf(ch)==y.lastIndexOf(ch)){
           System.out.println(ch);
       }

       char ch1 = y.charAt(1);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(2);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }





    }
}
