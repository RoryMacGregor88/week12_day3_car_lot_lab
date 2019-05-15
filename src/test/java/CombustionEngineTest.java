import CarParts.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombustionEngineTest {

    ElectricEngine combustionEngine;

    @Before
    public void before() {
        combustionEngine = new ElectricEngine();
    }

    @Test
    public void canStartIfHasFuel() {
        combustionEngine.setPower(1.00);
        combustionEngine.start();
        assertEquals(true, combustionEngine.isRunning());
    }

    @Test
    public void wontStartIfHasNoFuel() {
        combustionEngine.setPower(0.00);
        combustionEngine.start();
        assertEquals(false, combustionEngine.isRunning());
    }

    @Test
    public void canStop() {
        combustionEngine.stop();
        assertEquals(false, combustionEngine.isRunning());
    }

}