package tekrardaytime.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.

        /*
        1) Kullanicidan data almak icin Scanner object olusturmaliyiz.
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyiz.
        3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.

         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the number of elements you want to add");
            int numOfelement = input.nextInt();

            String stdNames[] = new String[numOfelement];

            System.out.println("To stop adding press 'q'");


            for (int i = 0; i<stdNames.length; i++){
                System.out.println("Enter the " + (i+1) + ". student name");

                String name = input.next();

                if (name.equalsIgnoreCase("q")){
                    break;

                }else {
                    stdNames[i] = name;
                }

            }
            System.out.println(Arrays.toString(stdNames));


        }
}
