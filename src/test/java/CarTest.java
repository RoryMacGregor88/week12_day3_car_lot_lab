import CarParts.Transmission;
import Cars.BMW;
import Cars.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new BMW();
    }

    @Test
    public void hasColor() {
        assertEquals("Blue", car.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(40000.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasEngine() {
        assertEquals(true, car.getEngine() != null);
    }

    @Test
    public void hasTransmission() { assertEquals(Transmission.AUTOMATIC, car.getTransmission()); }
}
