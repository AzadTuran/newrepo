package Introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char      - boolean - byte - short - int     - long - float  - double
        //Wrapper Class : Character - Boolean - Byte - Short - Integer - Long - Float -  Double

        //Wrapper Class'lar non-primitive'dir. O yuzden memory'de cok yer kaplarlar.
        //O yüzden şart değilse Wrapper Class kullanmayı tercih etmeyiz ama böyle bir şey olduğundan da haberdar olmalıyız.



        //"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive" ler method icermez
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method gorebilirsiniz, cunku wrapper class lar method icerir.
        Integer m = 12;



        byte a = 13;
        Byte b = 13;

        // Ornek 1 : short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Ornek 2 : i)Primitive int'i wrapper Integer'a ceviriniz.
        int num = 5;
        Integer warppernum = num;














    }
}
