package javaders.day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays03_yıldızlıSoru {
    public static void main(String[] args) {
        //Kullanıcının coklu datayı bir array'e yerlestirebilmesi için gereken kodu yazınız.


        /*

        1) Kullanicidan data almak icin Scanner object olustur
        2) Coklu datayi yerlestirmek icin bir array olusturmaliyim.
        3)Arrray olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
        4)Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.


        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want to add : ");
        int numOfElements = scan.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("To stop adding press 'q'.");
        for (int i = 0; i <stdNames.length ; i++) {
            System.out.println("Enter the " + (i+1) + ". student name : ");

            String name = scan.next();

            if(!name.equalsIgnoreCase("q")){
                stdNames[i] = name ;
            }else{
                break;
            }
        }

        System.out.println(Arrays.toString(stdNames));



    }
}
