package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public class FastCarBuilding implements CarFactory {
    @Override
    public Engine addEngine() {
        return new FastCarEngine();
    }

    @Override
    public MaxSpeed addMaxSpeed() {
        return new FastCarMaxSpeed();
    }
}
