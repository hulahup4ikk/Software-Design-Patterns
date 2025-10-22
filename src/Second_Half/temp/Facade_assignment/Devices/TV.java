package Second_Half.temp.Facade_assignment.Devices;

public class TV implements IDevice {
    private boolean poweredOn;
    private int channel;
    private int volume;

    public TV() {
        this.poweredOn = false;
        this.channel = 1;
        this.volume = 25;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(volume, 100));
    }
}