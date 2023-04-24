package team05soruçözümü;

public class C06_replaceAllörnek {
    public static void main(String[] args) {

        String s = "Ali Can";
        String t ="";

        for (int i = 0; i <s.length() ; i++) {
            if('a'<=i && i<'z'){
                t += t.replaceAll("[i]","*");
                System.out.println(t);
            }else {
                System.out.println(i);

            }

        }

    }
}
