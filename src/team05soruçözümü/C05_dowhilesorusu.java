package team05soruçözümü;

import java.util.Scanner;

public class C05_dowhilesorusu {

    //Write a Java program using a do-while loop which receives some Integer values and stops
    //when the sum of even values is equal to thr sum of odd values entered do far.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumEven =0;
        int sumOdd =0;

        do{
            System.out.print("Enter Integer value : ");
            int num = scan.nextInt();

            if(num%2==0){
                sumEven += num;

            }else{
                sumOdd += num ;
            }

        }while (sumEven!=sumOdd);

        System.out.println("The sum of even values is now equal to the sum off odd values ");
    }
}

