package team05soruçözümü;

import java.util.Scanner;

public class C06_tekrar2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;


        while(sumEven!=sumOdd){


            System.out.print("Enter Integer value : ");
            int num = scan.nextInt();


            if(num%2==0){
                sumEven += num;

            }else{
                sumOdd += num ;
            }

        }
        System.out.println("The sum of even values is now equal to the sum off odd values ");
    }
}
