package ErolWork;

public class C08_Loops {
    public static void main(String[] args) {

        /*
        B!r String’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
        Örnegin; accessories ´ ces
         */



            String s = "accessories";
            String sh = "";

            for (int i = 0; i < s.length(); i++) {

                String  ch = s.substring(i, i+1);

                if (s.indexOf(ch)!=s.lastIndexOf(ch)){
                    if (!sh.contains(ch)){
                        sh+=ch;
                    }
                }
            }
            System.out.println(sh);

        }
}
