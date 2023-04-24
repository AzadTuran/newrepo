package javaders.day15loopsarrays;

import java.util.Arrays;

    /*
    1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
      Yani; logic data'ya bagimli olmamalidir.
      Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
      "hard code" hatali kod demektir.

      Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
      "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
      kullanirsaniz hep dogru sonucu alirsiniz

    */

public class C03_Arrays02 {
    public static void main(String[] args) {
        //Array'leri kısa yoldan nasıl oluşturabiliriz.

        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); //[67, 98, 100, 34, 76]

        // grades array'deki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu yainiz.
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades)); //[34, 67, 76, 98, 100]

        System.out.println(grades[0]+grades[grades.length-1]);//134


        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames) {
            if(w.length()<5){
                System.out.println(w);
                // eğer ki bi soru array içeriyorsa ve bize for lazımsa ilk önce for each dene!!!!!!!!!!!!!!
            }
        }

        System.out.println(" ");

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //   isimlerden onceki isimleri console'a yazdiriniz.

        Arrays.sort(stdNames); //[Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String i : stdNames){
            if(i.startsWith("F")){
                break;

            }
            System.out.println(i);

        }
        System.out.println(" ");

        //Example 4 :Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimler haric diğer  isimleri console'a yazdiriniz.

        Arrays.sort(stdNames);
        //short() method'u numeric data'lari kucukten buyuge(ascending) dizer.
        //Stringleri ise alfabetik(alphabetically) sirada dizer
        // ascending + alphabetically==> Naturel Order

        for(String s : stdNames){
            if(s.startsWith("F")){
            continue;
            }else{
                System.out.println(s);
            }
        }
    }
}
