package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public abstract class CarBuilding {
    protected abstract Car makeCar(String typeOfCar);

    public Car orderCar(String typeOfVehicle){
        Car orderedCar = makeCar(typeOfVehicle);
        orderedCar.buildCar();
        orderedCar.carPower();
        orderedCar.carMaxSpeed();
        return orderedCar;
    }
}
