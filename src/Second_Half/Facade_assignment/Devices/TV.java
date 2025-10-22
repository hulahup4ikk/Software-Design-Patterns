package Second_Half.Facade_assignment.Devices;

public class TV implements IDevice {
    private boolean poweredOn;
    private int channel;

    public TV() {
        this.poweredOn = false;
        this.channel = 1;
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

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < 1) {
            throw new IllegalArgumentException("Channel number must be positive");
        }
        this.channel = channel;
    }
}
