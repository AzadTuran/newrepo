package practices.b151practices.practices2;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

        // 12345 sayisinin rakamları toplamını bulunuz.

        //1.YOL

        int x = 12345;

        int fifth = x%10;//5
        x = x/10; //1234
        int fourth = x%10;//4
        x = x/10; //123
        int third = x%10;//3
        x = x/10; //12
        int second = x%10; //2
        x = x/10; //1
        int first = x%10; //1

        int total = first+second+third+fourth+fifth;
        System.out.println("total = " + total);//15

        //2.YOL

        // 12345 sayısının rakamları toplamını bulunuz

       int a = 12345;

        int birler = a%10;   // 5

        int onlar = (a/10)%10;  // 4

        int yuzler = (a/100)%10;  // 3

        int binler = (a/1000)%10;  // 2

        int onbinler = a/10000;   // 1

        System.out.println(birler + onlar + yuzler + binler + onbinler); //15


    }
    }
