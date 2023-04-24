package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy
        
        
        sb1.reverse();//String'in ters çevrilmesi loop'lar ile de yapilir. bu kısa bir yoldur.
        System.out.println(sb1); //ysae si avaJ
    }
}
