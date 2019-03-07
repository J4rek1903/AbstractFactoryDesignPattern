package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public class SlowCar extends Car {

    CarFactory slowCarFacory;

    public SlowCar(CarFactory slowCarFacory){
        this.slowCarFacory=slowCarFacory;
    }

    @Override
    void buildCar() {
        System.out.println("Building :"+getBrand());
        engine=slowCarFacory.addEngine();
        speed=slowCarFacory.addMaxSpeed();
    }
}
