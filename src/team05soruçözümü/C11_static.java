package team05soruçözümü;

public class C11_static {
    static int a = 11;

    public static void main(String[] args) {


        int b = 15 ;
        System.out.println(b);
    }
    static {
        a = 13;
        System.out.println(a);
    }
}

//  çıktı 13
//        15  olur. çünkü önce static çalışır.
