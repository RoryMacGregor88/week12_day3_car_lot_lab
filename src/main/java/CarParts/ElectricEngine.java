package CarParts;

public class ElectricEngine implements IEngine {

    private boolean isRunning;
    private double power;

    public ElectricEngine() {
        this.isRunning = false;
        this.power = 0.00;
    }

    public ElectricEngine(double power) {
        this();
        this.power = power;
    }

    @Override
    public void start() {
        isRunning = power > 0;
        tick();
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public void tick() {
        power -= 1;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
