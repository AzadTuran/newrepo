package javaders.day27interface;

    /*

                                     Interface'deki Method'lar

    1)"interface" icine "concrete method" konulmaz.
    2)"interface" icindeki methodların abstract oldugunu Java bilir,bu yüzden "interface" icindeki
    "abstract method"larda "abstract" keyword kullanmaya gerek yoktur.
    3)"interface" içindeki abstract methodların tamamı "public"dir.Bu yüzden "interface" içinde abstract method olustururken
    "access modifier" yazmaya gerek yoktur.

    4)Bir "interface" i bir "class" in parenti yapmak istediğimizde "extends" yerine "implements" keywordu kullanırız.
    5)"Concreet Child Class"lar "parent interface"deki "abstract methodları" override etmek zorundadirlar.
    6)"interface"ler bir applicationda "Concrete Child Class"larin yapmak zorunda olduklari fonksiyonları
    barındırırlar.Bu yüzden "interface"lere "to-do list" de denir.
    7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz.
    abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi
    birini override ederek kullanabilirler.
    8)Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
    method'larin "return type"lari ayni olmak zorundadir.
    9) Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method" koymamiz gerekirse
          i) "default" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
          koyabiliriz. default void ceo () { System.out.println("Uses gas less...");}

          ii) "static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
          koyabiliriz. static void stop () { System.out.println("Stop securely...");}

    10)"default" veya "static" keyword'unu olusturdugunuz concrete methodla'in "concrete child class" lar tarafindan
    kullanilma zorunlulugu yoktur.
    11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
    ulasilabilir.
    "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
    olusturmaya gerke yoktur, "interface" ismi yeterlidir.
    12)"interface"lerden object oluşturulamaz.Çünkü bu methodlar bodysi olmadığı için yarım method'dur. Yarım methodlardan
    yarım object oluşur. Yraım obje de Java da hata verir.
    13)""interface"lerin "constructor"i yoktur.


    */

public interface Engine {

   void start();

   void payment();

   default void eco(){
       System.out.println("Uses gas less...");
   }

   static void stop(){
       System.out.println("Stops securely...");
   }
}
