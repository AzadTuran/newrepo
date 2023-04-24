package javaders.day14loops;

public class C02_loops02 {
    public static void main(String[] args) {
        //3'den 8 e kadar tüm kodları console'a yazdıran kodu yazınız.

        //1.way
        for(int i =3; i<=8; i++){
            System.out.print(i+" ");
        }

        System.out.println(" ");

        //2.way
        int i =3;
        while (i<=8){
            System.out.print(i+" ");
            i++;
        }



    }
}
