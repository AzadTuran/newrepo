package javaders.day24inheritancepolymorphism;

public class Car {
    public void move(){
        System.out.println("Cars move...");
    }

    public void getbreak(){
        System.out.println("Cars break...");
    }

    public void engine(){
        System.out.println("Cars have engine...");
    }

    public String model = "";
    public int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        System.out.println("Car constructor 2");
    }


}
