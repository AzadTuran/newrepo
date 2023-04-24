package Introduction.day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yaşınızı giriniz: ");
        byte age = scan.nextByte();

        System.out.println("Yaşınız: " + age);


    }
}
