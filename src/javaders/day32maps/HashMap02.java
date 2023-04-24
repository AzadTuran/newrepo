package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //INTERVIEW SORUSU
        //Example 1: Type code to print the number of occurrences of words in a sentence.
        //Verilen cümledeki kelimelerin görünüm sayısını veen kodu yazınız.

       //"I like you, like like!"  => I=1, like=3,  you=1

        String s = "I like you, like like!";

        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim.
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s); //I like you like like

        //Ben kelimelerle calismalıyım bu yüzden split(" ") kullanacagım.
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
       //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
      //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.


        for(String w : words){

           Integer numOfOccurrence =  occ.get(w);

           if(numOfOccurrence==null){
               occ.put(w,1);
           }else{
               occ.replace(w,numOfOccurrence+1);
           }
        }

        System.out.println(occ); //{like=3, I=1, you=1}


    }
}
