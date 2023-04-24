package ErolWork;

public class C06_StringManipulation {
    public static void main(String[] args) {
        //B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
        //yazınız.


        String s = "Ali/";
        int counter = 0;

        if (s.charAt(0)>='A' && s.charAt(0)<='Z'){
            counter++;
        }if (s.substring(s.length()-1).contains(".")){
            counter++;
        }
        if (counter==2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
