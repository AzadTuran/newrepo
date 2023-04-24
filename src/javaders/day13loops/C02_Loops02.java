package javaders.day13loops;

public class C02_Loops02 {
    public static void main(String[] args) {

        // Verilen bir String'deki kucuk harfleri console'a yazmayiniz.
        //"Pwd12?Ab" ==> P12?A

        String str = "Pwd12?Ab";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch>='z'){
                continue;
            }else{
                System.out.print(ch);
            }

        }


        //Bir string i ters ceviren kodu yazdiriniz
        // "Java" ==> "avaj"


        String t  = "Apex" ;
        String ters = "";
        for(int i = t.length()-1; i>=0 ;i-- ){
            ters = ters + t.substring(i,i+1);
            //System.out.println(ters); burada yazdirma islemimizi yaparsak butun adimlari yazdirir
            //x
            //xe
            //xep
            //xepA
        }
        System.out.println(ters); //xepA

        //2.way



    }
}
