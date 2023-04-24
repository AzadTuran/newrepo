package SoruÇözümlerim.KahveMakinesi;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        deneme azad = new deneme();
        azad.showMenu();
    }
     void showMenu() {
        int option = -1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to COFFEE HAYAL ");
        System.out.println("Please enter number coffee that you want to drink ");
        System.out.println("\n");
        System.out.println("1. Türk kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");

        do {
            System.out.println("*************************************************************************************");
            System.out.println("Enter an option");
            System.out.println("*************************************************************************************");
            option = scan.nextInt();
            System.out.println("\n");

            switch (option) {
                case 1, 2, 3:

                    break;
                case 4:
                    break;

                default:
                    System.out.println("Invalid option!!  Please try again");
                    break;
            }

        } while (option != 1 && option != 2 && option != 3 && option != 4);

}
    }
