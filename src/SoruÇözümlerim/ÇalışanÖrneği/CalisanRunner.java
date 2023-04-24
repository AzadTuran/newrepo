package SoruÇözümlerim.ÇalışanÖrneği;

public class CalisanRunner {
    public static void main(String[] args) {

        Calisan c1 = new Calisan();
        Calisan c2 = new Calisan(123,"Azad","Turan",8535,5);

         c2.calisanBilgileriGoster();//çıktısı aşağıda

         /*
         **************ÇALIŞAN BİLGİLERİ****************
        No      : 123
        Name    : Azad
        Surname : Turan
        Salary  : 8535.0
        Tecrübe : 5

          */

        c2.zamYap(500);//çıktısı aşağıda

        /*
        Maaşınıza 500Tl zam yapıldı.
        Şuanki güncel maaşınız 9035.0 tl değerindedir.
         */

    }



}
