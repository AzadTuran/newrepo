package javaders.day07stringmanipulation;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //********************* replaceAll() *********************************\\

        /* replaceAll() bir grup datayi degistirmek icin kullanilir.
        Bir Grup Data = Regular Expression (Regex) kullanilir.

        En Çok Kullanılan Regexler:
        1) Tum Rakamlar ==> [0-9]
2)      2) Tum Kucuk Harfler ==> [a-z]
3)      3) Tum Buyuk Harfler ==> [A-Z]
4)      4) Tum Harfler ==> [a-zA-Z]
5)      5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
6)      6) Tum Sesli Harfler ==> [aeiouAEIOU]
7)      7) Tum Noktalama Isaretleri ==> \\p{Punct}

        */
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";

        //örnek: s string'deki  tum rakamları * yapınız.
        String s1 = s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);//s1 = Mehmet Fatih bey ** yasinda QA_Developer kursunda $ dolarla maas kazanmistir...

        //örnek2: s string'deki  tum harfleri ve tüm rakamları @ yapınız.
        String s2 =s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("s2 = " + s2);//s2 = @@@@@@ @@@@@ @@@ @@ @@@@@@@ @@_@@@@@@@@@ @@@@@@@@ $ @@@@@@@ @@@@ @@@@@@@@@@@...

        //örnek3: s string'deki  ttüm spaceler dışındaki karakterleri "+" yapınız.
        
        String s3 = s.replaceAll("[^ ]","+");
        System.out.println("s3 = " + s3);//s3 = ++++++ +++++ +++ ++ +++++++ ++++++++++++ ++++++++ + +++++++ ++++ ++++++++++++++
        
        // örnek4: s stringdeki tüm kucuk harfler dışındaki karakterleri "*"
        
        String s4 = s.replaceAll("[^a-z]","*");
        System.out.println("s4 = " + s4);//s4 = *ehmet**atih*bey****yasinda*****eveloper*kursunda***dolarla*maas*kazanmistir***

       // örnek5: s String'indeki tum sesli harfler dışındaki karakterleri   "&" ceviriniz

        String s5 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("s5 = " + s5);//s5 = &e&&e&&&a&i&&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&a&&aa&&&a&a&&i&&i&&&&





    }
}
