package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();//Queues'de  ilk eklenen ilk silinir.
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]
        //Burdan anlıyoruz ki peek ilk elemanı verir ama silmez.

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]
        //Burdan anlıyoruz ki poll ilk elemanı verir aynı zamanda siler.

        wareHouse.clear();//Tüm listeyi siler.
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//Exception
    }
}
