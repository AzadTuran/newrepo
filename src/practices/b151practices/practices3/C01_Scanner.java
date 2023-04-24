package practices.b151practices.practices3;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Interwiew Questions
        //Kullanıcıdan aldıgınız bir şekil ile asagıdaki sekli oluşturunuz.

        /*
             A
            A A
           A A A

       */


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }


        }
    }

