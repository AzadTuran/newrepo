package javaders.day23inheritance;

public class Animal {

    /*

    1)eat() methodu gibi bir çok class'in kullanması gereken method'lari her class'a ayri ayri yazarsak;
          i)   Tekrar yapmış oluruz, tekrar ideal code'da olmamalıdır.
          ii)  Ayni methodu tekrar tekrar yazmak zaman kaybıdır.
          iii) Tekrar tekrar yazılan methodun tamiri çok zaman alır.
          iV)  Tekrar tekrar yazilan method'un geliştirilmsi çok zaman alır.
          V)   Methodu tekrar tekrar yazmak "atomic yapi'ya tesrtir".

     2)private class member'lar child class'lar tarafından kullanılamaz.
       public class member'lar child class'lar tarafından kullanılabilir.
       default class member'lar aynı package'de child class'lar tarafından kullanılabilir.
       protected class member'lar farkli package'de de olsalar child class'lar tarafindan kullanılabilir.

     3)Java da bir class'in sadece 1 tane parent'İ olabilir.
       Coklu Parent'a "Multiple Inheritance" derler, tekli parent'a "Single Inheritance" derler.
       Java "Multiple Inheritance'i desteklemez,Java "Single Inheritance" destekler.

     4)Apartman şeklindeki inheritance yapisina "Multilevel Inheriance" denir.
       Java "Multilevel Inheritance" i destekler.


     */

    public void eat(){
        System.out.println("Animals eat...");

    }

    public void drink(){
        System.out.println("Animals drink...");
    }

}
