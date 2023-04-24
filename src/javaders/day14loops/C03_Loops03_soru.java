package javaders.day14loops;

public class C03_Loops03_soru {
    public static void main(String[] args) {
        //Size verilen küçük harfle yazılmış String'in indexi cift sayı olan karakterleri yazırın.
        //miami ==> MiAmİ

        String s = "miami";
        String k ="";

        for (int i = 0; i <s.length() ; i++) {

            if(i%2==0){
                k+= i;
                k += k.toUpperCase();
            }else{
                k+=i;
            }
        }
        System.out.println(k);




    }
}
