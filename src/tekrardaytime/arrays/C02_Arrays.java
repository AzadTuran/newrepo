package tekrardaytime.arrays;

import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {
        //+,-,*,/,% islemlerini yapabilen bir hesap makinesi yapiniz.
        // Kulllanici q'ya basmadigi surece islem secip yapabilsin.



        /*
        1)Scanner object olustur.
        2)Kullanicidan yapacagi islemi al.
        3)Kullanicidan iki tane sayi almaliyiz.
        4)Tekrar Tekrar islem yapabilmek icin loop
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("To stop calculation press q");

        do{
            System.out.println("Please enter the operating among +, -, /, *, % ");
            char opr = scan.next().charAt(0);

            if(opr=='q' || opr =='Q'){
                System.out.println("See you again");
                break;
            }

            boolean r = opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';

            if (!r){
                System.out.println("Undefined operations");
                break;
            }

            System.out.println("Enter the first number");
            int n1 = scan.nextInt();

            System.out.println("Enter the second number");
            int n2 = scan.nextInt();


            switch (opr){

                case '+' :
                    System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                    break;

                case '-' :
                    System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                    break;
                case '*' :
                    System.out.println(n1 + "x" + n2 + "=" + (n1*n2));
                    break;
                case '/' :
                    System.out.println(n1 + ":" + n2 + "=" + (n1/n2));
                    break;
                case '%' :
                    System.out.println(n1 + "%" + n2 + "=" + (n1*n2)/100);
                    break;
                default:
                    System.out.println("Undefined operation");
            }

        }while (true);
    }
}
