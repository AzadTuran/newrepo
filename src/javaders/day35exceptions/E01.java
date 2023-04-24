package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123")+2);  //125 ==> yani 123 Stringini 123 sayısı olarak alıp 2 ile topladı.

        System.out.println(convertStringToInt("12ab")+2); //NumberFormatException alırız. Ama artık düzelttik aşağıda 14 çıktı yazar.

    }

    //Bir String'i Integer'e ceviren method olusturunuz

    public static int convertStringToInt(String str){
        try{
            return Integer.valueOf(str);

        }catch (NumberFormatException e){ //valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.

           str = str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);


            /*
            NumberFormatException'i alinca exception'i handle etmek icin method body'si icine try ve catch yazdik.
            try body'si icine return Integer.valueOf(str) yazdik. catch icine ilgili exception ismini e harfi ile yazdik.
            catch body'si icine replaceAll methodu ile rakamdan farkli karakterleri sildik. kalani yine str'ye assign ettik.
            Ardindan return kismini yazinca java artik hata vernmedi.
             */
        }

    }
}
