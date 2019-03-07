package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public abstract class Car {
    private String brand;
    MaxSpeed speed;
    Engine engine;
    public void setBrand(String newBrand){
        brand=newBrand;
    }
    public String getBrand(){
        return this.brand;
    }
    abstract void buildCar();

    public String toString(){
        String infoAbout = brand+" - power: "+engine+" ,drives "+speed+" per hour";
        return infoAbout;
    }
    public void carPower(){
        System.out.println(getBrand()+" has "+engine);
    }
    public void carMaxSpeed(){
        System.out.println(getBrand()+" drives "+speed+" per hour max");
    }
}
