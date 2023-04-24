package team05soruçözümü;

public class C09_Arrays {
    public static void main(String[] args) {
        //String' lerden olusan b!r arrayde uzunlugu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Ang!e, Vel! ) ==> Output is Mark, Veli

        String words[] = {"Kemal", "Jonathan", "Mark", "Ang!e"};

        int minLenght = words[0].length();

        for (String w : words) {
            minLenght = Math.min(minLenght, w.length());
            System.out.println(minLenght);


        }
        for (String w : words) {
            if (minLenght == w.length()) {
                System.out.println(w);
            }
        }
    }
}


