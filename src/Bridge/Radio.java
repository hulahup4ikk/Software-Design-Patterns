package Bridge;

class Radio implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is ON");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is OFF");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        volume = percent;
        System.out.println("Radio volume set to " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel < 1) channel = 1;
        this.channel = channel;
        System.out.println("Radio channel set to " + this.channel);
    }
}
