package DesignPatterns;

/**
 * Created by Basia on 2019-03-07.
 */
public class SlowCarBuilding implements CarFactory {
    @Override
    public Engine addEngine() {
        return new SlowCarEngine();
    }

    @Override
    public MaxSpeed addMaxSpeed() {
        return new SlowCarMaxSpeed();
    }
}
