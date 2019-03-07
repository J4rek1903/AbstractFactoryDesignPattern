package DesignPatterns;

public class Main {

    public static void main(String[] args) {
        CarBuilding factory = new Factory();
        Car bmw = factory.orderCar("BMW");
        System.out.println("\n"+bmw+"\n");
        Car fiat = factory.orderCar("FIAT");
        System.out.println("\n"+fiat+"\n");


    }
}
