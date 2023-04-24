package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop(); //stop() method'u static oldugundan "interface"ismi ile ulaştım.

        Honda h = new Honda();
        h.eco(); //eco() method'u static olmadiğindan(default method) "object" ismi ile ulaştım.


    }
}
