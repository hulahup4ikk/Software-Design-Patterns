package First_Half.Bridge;

public class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
        System.out.println("Remote connected to " + device.getClass().getSimpleName());
    }

    public void togglePower() {
        System.out.println("Remote: toggle power");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        System.out.println("Remote: previous channel");
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        System.out.println("Remote: next channel");
        device.setChannel(device.getChannel() + 1);
    }
}