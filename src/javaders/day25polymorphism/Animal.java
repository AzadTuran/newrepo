package javaders.day25polymorphism;

public class Animal {

    /*

    1)Parent'taki method ile Child'da Override edilen method'un acsess modifier'ları aynı olabilir.
    2)Child'da Override edilen method'un acsess modifier'i Parenttaki methodun acsess modifierından dar olamaz.
    3)Parenttaki methodun acsess modifierı Child'da Override  edilen methodun acsess modifier'indan dar olabilir.

    4) Method' un return type' i "primitive" ise Overrriding yapildiginda return type degistirilemez.
    5) Method' un return type' i "void" ise Overrriding yapildiginda return type degistirilemez.

    6)Child'da Override edilen method'un "return type"i ile Parent'taki method'un "return type"i arasinda IS-A iliskisi
      varsa "return type"degisitirilebilir, aksi takdirda degistirilemez.
      Mesela; Integer Wrapper Class ile Long Wrapper Classs arasinda "IS-A" ilişkisi yoktur, o yuzden return type Integer oldugunda Longa degistirelemez.


    7) Return type Wrapper Class oldugunda,Overriding yaparken "return type" degistirilemez.

    8) "final method"lar Override edilemezler.
       "final method"larin body'si degistirilemez ama Override ederken method body'i degistiririz bu bir celiskdir.
        Bu yuzden Java "final method"larin Override edilmesine musaade etmez.

    9)"static method"lar Override edilemezler. Cunku "static method"lar tum child'lar icin ortak method'lardir
      Bir child'in ortak method'u degistirdiginde diger Child'lar bundan etkilenir. Bu etkilenme ummadik sonuclar ortaya cikarabilir.
      Bu yuzden Java "static method"larin Override edilmesine musaade etmez.(main maethod da override edilemez o da statictir çünkü)


    10)"private method"lar Override edilemez.


     */

         protected void move(){
             System.out.println("Animals move..");

            }

            protected int add(int a, int b){
             return a+b;
            }

            public Animal create(){
             return new Animal();
            }

            public Integer multiply(Integer a, Integer b){
             return a*b;
            }

            public final double circleArea(double r){
             return 3.14*r*r;
            }


}
