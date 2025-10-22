package Second_Half.temp.Facade_assignment.Devices;

public class Lights implements IDevice {
    private boolean poweredOn;
    private int brightness;

    public Lights() {
        this.poweredOn = false;
        this.brightness = 100;
    }
    @Override
    public void on() {
        setPoweredOn(true);
    }

    @Override
    public void off() {
        setPoweredOn(false);
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = Math.max(0, Math.min(brightness, 100));
    }
}
