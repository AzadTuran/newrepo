package practices.b151practices.practices6;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
         /*

       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker

        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yılı Giriniz : ");
        int yil = scan.nextInt();
        System.out.print("Bir ay numarası giriniz : ");
        int ay = scan.nextInt();

        switch (ay){
            case 1:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 2:
                if(yil%4==0){
                    System.out.println("Bu ay 29 çeker ");
                }else{
                    System.out.println("Bu ay 28 çeker ");
                }
                break;


            case 3:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 4:
                System.out.println("Bu ay 30 gun çeker");
                break;
            case 5:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 6:
                System.out.println("Bu ay 30 gun çeker");
                break;
            case 7:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 8:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 9:
                System.out.println("Bu ay 30 gun çeker");
                break;
            case 10:
                System.out.println("Bu ay 31 gun çeker");
                break;
            case 11:
                System.out.println("Bu ay 30 gun çeker");
                break;
            case 12:
                System.out.println("Bu ay 31 gun çeker");
                break;
            default:
                System.out.println("Geçerli bi ay numarası giriniz.z");



        }


    }
}
