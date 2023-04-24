package javaders.day18constructersstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

        //static olan "kayitliOgrenciSayisi" variable'ini cagirma için sadece class ismini kullandık, object oluşturmadık.
        System.out.println(Student.kayitliOgrenciSayisi);

        //static olmayan "num" variable'ini cağırmak icin object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);


    }
}
