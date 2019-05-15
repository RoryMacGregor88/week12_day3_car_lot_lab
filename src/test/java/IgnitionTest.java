import CarParts.ElectricEngine;
import Cars.BMW;
import Cars.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IgnitionTest {

    Car car;

    @Before
    public void before() {
        car = new BMW();
    }

    @Test
    public void canStartCarWithIgnition() {
        car.getIgnition().on();
        assertEquals(true, car.getEngine().isRunning());
    }

}
