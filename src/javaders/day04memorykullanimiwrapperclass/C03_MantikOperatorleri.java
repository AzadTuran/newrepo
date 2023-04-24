package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C03_MantikOperatorleri {
    public static void main(String[] args) {
        /*
        Javada islem yaptiran
        == Esittir
        !=Esit Değildir
        < Kucuktur
        > Buyuktur
        = atama operatoru

         1< 4 < 5  ==>   matematik uclu karsilastirma yapar Ancak Java uclu kiyas yapamaz
        1<4  && 4<5;==> Java bu sekilde ikili kiyas yapip Mantik Operatorleriyle birlestirme yapar

        &&  ==> ve hem operatoru mukemmeliyetci yapidadir.True dondurmesi icin her iki sartinda saglanmasi gerekir
        & ile  && arasindaki fark
        (3<5 && 3<9 && 11<2 && 4<8 && 2<3 )
        cift && operatoru kodun tamamina bakmadan ilk gordugu False degerinde False dondurur
        Bu nedenle tek & operatorune gore daha hizli calisir
        Tek & operatoru tum kodu tarar tek bir false var ise false dondurur
        ama bunun icin tum kodun bitmesini bekler.Bu nedenle &&
        operatorune gore daha yavas calisir

        (3<5 & 3<9 & 11<2 & 4<8 & 2<3 )

        Cay   ve    Limon
        +     &&     +  ==> True;
        +     &&     -  ==> False;
        -     &&     +  ==> False;
        -     &&     -  ==> False;


        || ==> veya operatoru Polyanaci yapidadir. En ufak bir pozitif durumda True dondurur
        Cay   veya    Limon
        +     ||     +  ==> True;
        +     ||     -  ==> True;
        -     ||     +  ==> True;
        -     ||     -  ==> False;

       */



    }


}
