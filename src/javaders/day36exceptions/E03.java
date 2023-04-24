package javaders.day36exceptions;

/*
            "throws" ile "throw" farkı nelerdir ?

            1)"throws" method signature satirinda kullanilir,"throw" is method body icinde kullanilir.
            2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
            3)"throws" dan sonra sadece Exception Class isimleri yazilir,
              "throw" dan sonra ise Exception Class'dan object olusturulur.

 */
public class E03 {

    public static void main(String[] args) {

        printAge(23);

        try{
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

        printAge(-9);

    }
    //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz

    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");
        }
        System.out.println(age);
    }
}
