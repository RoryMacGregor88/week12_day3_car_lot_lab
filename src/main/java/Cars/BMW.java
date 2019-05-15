package Cars;

import CarParts.ElectricEngine;
import CarParts.Transmission;

public class BMW extends Car {

    public BMW() {
        super(40000.000, "Blue", new ElectricEngine(1.00), Transmission.AUTOMATIC);
    }
}
