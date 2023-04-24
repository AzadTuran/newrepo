package ErolWork;

public class C11_LoopsŞekilÇizme {
    public static void main(String[] args) {
        /*
        A
        A A
        A A A
        A A A A
         */


        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }
        System.out.println();

        //Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A

        int row = 3;

        int column = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A ");

            }
            System.out.println();
        }

    }
}
