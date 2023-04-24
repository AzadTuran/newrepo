package javaders.day18constructersstatickeyword;

public class MethodOverloading {

    /*

    1)Bir method "ayni isim"ve "farkli parametre"lerle olusturulursa buna "MethodOverloading"denir.

    2)"MethodOverloading" Java da "iyi organizasyon" icindir.

    3)MethodOverloading yaparken parametre 3 sekilde degistirilebilir;

      i)Parametrelerin sayilari degistirilebilir.
      ii)Parametrelerin data typlerini degistirebilirsiniz
      iii)Parametrelerin data typleri farkli ise yerleri degistirilebilir.

     4)"Method Overloading" bir class'in icinde olusur bu yüzden "private" method'lar da overloading edilebilir.
     (Sorarlarsa evet olur dersin çünkü aynı classın içindesin private de aynı class için çalışıyor. O yüzden sıkıntı çıkmaz Overloading yapılır)

     5)"Method Overloading" butun acsess modifier'larda kullanılabilir.

     6)"static" method'lar "overload" edilebilir.

     */
    public static void main(String[] args) {

        System.out.println(add(5,8));//13
        System.out.println(add(3.5,8));//11.5
    }

    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a , int b, int c){
        return a+b+c;
    }
    public static double add(double a , int b){
        return a+b;
    }
    public static double add(int a , double b){
        return a+b;
    }
}
