package advancepractice.day01;

public class C01_StringBuilderBufferKiyas {
    /*
2023 Nisan QA Tester
 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
 * kontrol edip C01_StringBuilder ,String Buffer ve String class'larinin performanslarini
 * karsilastiralim.
 * Ipucu: long TimeSb = System.nanoTime(); kullanalim
 */

    public static void main(String[] args) {
        String str = "Merhaba";
        System.out.println(" ****************************** String ********************************");
        long time1 = System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            str +=" "; // str = str+" ";
        }
        long time2 = System.nanoTime();
        long stringSure=time2-time1;
        System.out.println("stringSure = "+stringSure/1000+" nano saniye");//StringSure = 32137 nano saniye

        System.out.println(" ************ StringBuffer ********************");
        StringBuffer buffer = new StringBuffer("Merhaba");
        long time3= System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            buffer = buffer.append(" ");
        }
        long time4= System.nanoTime();
        long bufferSure =time4-time3;
        System.out.println("Buffer Sure = "+bufferSure/1000+" nano saniye");//235


        System.out.println("****************String Builder ***********************");
        StringBuilder builder = new StringBuilder();
        long time5= System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            builder = builder.append(" ");
        }
        long time6= System.nanoTime();
        long builderSure =time6-time5;
        System.out.println("Builder Sure = "+builderSure/1000+" nano saniye");

    }
}
