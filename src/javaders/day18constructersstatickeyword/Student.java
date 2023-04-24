package javaders.day18constructersstatickeyword;

public class Student {
    /*

    1)"static" class member'lar(variable + method + constructor + code blocks) tum object'ler tarafından paylasilir.
    2)"static" class member'lardaki tüm degisiklikler tum object'ler tarafından otomatik olarak görülür.
    3)"static" class member'lar gökteki ayın dünyaya bağlı olduğu gibi, class'a bağlıdırlar.
      Bu yüzden static variable'lara "class variable" da denir.
    4)"static" class member'ların nasıl çalıştığını anlamak için cizim yapip static olanları class'a olmayanları object'e
     baglayarak dusunmek bu konuyu kolaylaştırır.
    5)"static" class member'ları cagırmak için object olusturmak gerekmez ve tavsiye edilmez.
     "non-static" class member'ları cagirmak için object olustrumak şarttır.

     */

    public static int kayitliOgrenciSayisi = 0;
    public int num = 0;

    public Student() {
        kayitliOgrenciSayisi++;
        num++;

    }

    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student();

        Student s3 = new Student();

        System.out.println(kayitliOgrenciSayisi);//3
        System.out.println(s1.num);//1
        System.out.println(s2.num);//1
        System.out.println(s3.num);//1
    }
}
