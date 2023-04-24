package team05soruçözümü;

import java.util.Scanner;

public class C10_AsalSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean AsalMi = false;
        System.out.print("Bir sayi girin : ");
        int sayi = scan.nextInt();

        for(int i=2; i<sayi; i++){
            if(sayi%i==0){
                AsalMi = false;
                System.out.println("false");
                break;
            }else{
                AsalMi = true;
                System.out.println("true");
                break;

            }

        }

        if(AsalMi){
            System.out.println("Sayi asaldir");
        }else{
            System.out.println("Sayi asal değildir");
        }
    }
}
