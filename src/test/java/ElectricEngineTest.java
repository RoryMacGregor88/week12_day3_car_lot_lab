import CarParts.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    ElectricEngine electricEngine;

    @Before
    public void before() {
        electricEngine = new ElectricEngine();
    }

    @Test
    public void canStartIfHasPower() {
        electricEngine.setPower(1.00);
        electricEngine.start();
        assertEquals(true, electricEngine.isRunning());
    }

    @Test
    public void wontStartIfHasNoPower() {
        electricEngine.setPower(0.00);
        electricEngine.start();
        assertEquals(false, electricEngine.isRunning());
    }

    @Test
    public void canStop() {
        electricEngine.stop();
        assertEquals(false, electricEngine.isRunning());
    }

}
