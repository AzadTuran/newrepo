package Introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java da method nasıl oluşturulur?

    1)main method2un disinda classin icinde olusturulur.
    2)Accsess Modifier + Return Type + Method ismi + () + {}

     */


    public static void main(String[] args) {
        System.out.println( toplamaYap(3,5));
        System.out.println(multiply(7,8));
        System.out.println(firstTwoMultiplyThirdAdd(3,7,8));
        System.out.println(getCube(3.5));
        print("hello world");
    }
    // Ornek1: toplama islemi yapan bir method olusturunuz

    public static int toplamaYap(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    // Ornek3: verilen 3 sayıdan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan  bir method olusturun.
    private static int firstTwoMultiplyThirdAdd(int a, int b,int c){
        return a*b+c;
    }
    //Ornek4: verilen bir ondalık sayinin küpünü hesaplayan methodu olusturun
    //NOTE: Access modifier'i default yapmak için access modifier Yazmayiniz. Yani default yazma static önüne.

    static double getCube(double a){
        return a*a*a;
    }
    //Ornek5: girilen bir kelimeyi ekrana yazdiran bir method oluşturup kullanınız.
    public static void print (String str){
        System.out.println(str);

        // methodun return type'i void ise method body icinde return keyword yazilmaz.

    }
}
