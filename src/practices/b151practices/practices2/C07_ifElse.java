package practices.b151practices.practices2;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = scan.nextInt();
        System.out.print("enter a number: ");
        int b = scan.nextInt();

        if (a<b){
            System.out.println("ilk sayi ikinci sayidan kücüktür. ");
        } else if (a>b) {
            System.out.println("ilk sayi ikinci sayidan büyüktür.");

        }else{
            System.out.println("sayılar birbirine eşittir");
        }

    }
}
