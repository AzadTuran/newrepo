package javaders.day26abstration;

     /*

     1)Bazen parent class'taki method'un body'si hicbir hild class tarafından kullanılmaz.
     Bu durumda parent'taki method'a body yazmak hic hic kullanılmadıgı için mantikli degildir.
     Biz o methoda body yazmayiz.

     2)Body'si yazilmayan method'a "Abstract Method" denir.
     Abstract Ingilizcede "vucutsuz" veya "soyut" anlamindadir.

     3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract" keywordunu kullanarak Java'ya bu methodun bodysi olmayacak deriz.

     4)"abstract" keyword'unu kullaninca elde ettiğimiz  abstract method normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.

     5)Parent'taki method abstract ise butun child class'lar o methodu override etmek zorundadir.
     Bu yüzden tum child'lar icin mecburi olmasini istediğimiz fonksiyonlari abstract yapmak mantikli bir secimdir.

     6)Body'si olan method'lar(Concrete Method) abstract class'ların icine yaazılabilir.
     Abstract method'lar concrete class'larin içine yazilamazlar.

     7)"Abstract" keyword ile "method body" bir method'da ayni anda kullanılamazlar.

     8)"abstract" class'larin icinde "abstract methot"lar olur, "abstract medhod" lar
      body'si olmadigindan "eksik method"lar gibi dusunulebilir.
      Yani abstract class icinde eksik bir yapi barindirir, siz abstract class'dan
      object uretirseniz abstract class icindeki eksiklik object'e yansir ve object
      eksigi olan bir object olmus olur.
      Java bunu istemez cunku eksik object eksik is yapar, bu da application'in
      yanlis calismasina sebep olur.
      Java application'u korumak icin "abstract class"lardan object uretilmesini
      engellemistir.

    */

     /*

    "final" keyword'u aciklar misiniz?
    "final" keyword i) Variable'larda ii)method'larda iii)class'larda kullanilabilir.

    i)variable'larda kullanıldıgında a)O variable'a kesinlikle deger atamasi yapilmalidir.
                                     b)Ilk atanan deger degistirilemez.

    ii)method'larda kullanildiginda  a)O method'un body'Si degistirilemez.
                                     b)O method override edilemez.

    iii)class'larda kullanıldıgında  a)O class2in child classı olamaz.
                                     b)Ama final class'ın kendisi child olabilir.
    */

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn art...");
    }



}
