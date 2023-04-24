package team05soruçözümü;

public class C07_nestedforloop {
    public static void main(String[] args) {
        //Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A

        int rows = 4;


        for (int i=1; i<=rows; i++ ){

            for (int k =4; k>=i; k--){
                System.out.print("A ");
            }
            System.out.println(" ");

        }
    }
}
