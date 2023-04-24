package practices.b151practices.practices2;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        //        ve bunları şu şekilde konsola yazdırın:
        //
        //        Adı: ...
        //        Soyadı: ...
        //        Yas: ...
        //        Boy: ...
        //        Kilo: ...

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter name : ");
        String adı= scan.nextLine();
        System.out.print("Please enter surname : ");
        String soyadı = scan.next();
        System.out.print("Please enter age : ");
        int yas = scan.nextInt();
        System.out.print("Please enter lenght : ");
        int boy = scan.nextInt();
        System.out.print("Please enter weight : ");
        int kilo = scan.nextInt();

        System.out.println("******************************************************************");

        System.out.println("Adı:"+adı+"\nSoyadı:"+soyadı+"\nYas:"+yas+"\nBoy:"+boy+"\nKilo:"+kilo);



    }
}
