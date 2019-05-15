package Cars;

import CarParts.IEngine;
import CarParts.Ignition;
import CarParts.Transmission;

public abstract class Car {

    private double price;
    private String color;
    private IEngine engine;
    private Transmission transmission;
    private Ignition ignition;

    public Car(double price, String color, IEngine engine, Transmission transmission ) {
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.ignition = new Ignition(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IEngine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    };

    public Ignition getIgnition() {
        return ignition;
    }
}
