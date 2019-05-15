package CarParts;

import Cars.Car;

public class Ignition {

    private Car car;

    public Ignition(Car car) {
        this.car = car;
    }

    public void on() {
        car.getEngine().start();
    }

    public void off() {
        car.getEngine().stop();
    }
}
