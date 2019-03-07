package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public class Factory extends CarBuilding {
    @Override
    protected Car makeCar(String typeOfCar) {
        Car theCar = null;

        if(typeOfCar.equals("BMW")){
            CarFactory carParts = new FastCarBuilding();
            theCar = new FastCar(carParts);
            theCar.setBrand("BMW i8");
        }else if(typeOfCar.equals("FIAT")){
            CarFactory carParts = new SlowCarBuilding();
            theCar = new SlowCar(carParts);
            theCar.setBrand("FIAT DOBLO");
        }
        return theCar;
    }
}
