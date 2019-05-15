package CarParts;

public class CombustionEngine implements IEngine {

    private boolean isRunning;
    private double fuel;

    public CombustionEngine() {
        this.isRunning = false;
        this.fuel = 0.00;
    }

    @Override
    public void start() {
        isRunning = fuel > 0;
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public void tick() {

    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
