package javaders.day17multidimensionalarraypassbyvalue;

public class C04_example1tekrar {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Example 1 : Yukarıdaki student array toplam kaç isim barındırır.

        //şimdi ben bir sayı döndericem o yüzden bir int konteyner lazım.

        int result = 0;

        //şimdi arrayi baştan sona taramam lazım her karakteri görmek için
        //arrayler tarama işlemini her zaman for each ile yapmalısın Azad.

        for(String[] w : students){
            result += w.length;
        }
        System.out.println(result); //8

    }
}
