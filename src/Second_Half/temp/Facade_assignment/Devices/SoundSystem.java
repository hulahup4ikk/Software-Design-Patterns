package Second_Half.temp.Facade_assignment.Devices;

public class SoundSystem implements IDevice {
    private boolean poweredOn;
    private int volume;
    private String mode;

    public SoundSystem() {
        this.poweredOn = false;
        this.volume = 50;
        this.mode = "Stereo";
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(volume, 100));
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null || mode.isBlank() ? this.mode : mode;
    }
}
