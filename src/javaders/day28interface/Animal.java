package javaders.day28interface;

public interface Animal {

    //public abstract void eat(); aşağıda yazan bu aslında
    //public static değil çünkü static olsa body koymak gerekir çünkü static keywordunu body koymak için kullanırız.
     void eat();

     void drink();


     //1)interface'lerdeki tüm variable'lar otomatik olarak final'dır.
     //**bu yüzden interface içindeki varibale'i olusturdugunuzda mutlaka deger ataması yapmalısınız.
     //**bilindiği gibi final variable'ların degerleri degistirilemez.

    //2)interface'lerdeki tum variable'lar otomatik olarak "public"dir.
    //3)interface'lerdeki tum variable'lar otomatik olarak "static"dir.
     int age = 4;
}
