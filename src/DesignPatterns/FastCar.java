package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public class FastCar extends Car {

    CarFactory fastCarFactory;

    public FastCar(CarFactory fastCarFactory){
        this.fastCarFactory=fastCarFactory;
    }


    @Override
    void buildCar() {
        System.out.println("Building :"+this.getBrand());
        engine=fastCarFactory.addEngine();
        speed=fastCarFactory.addMaxSpeed();
    }
}
