package Bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        System.out.println("\nControlling a TV with a basic remote");
        RemoteControl tvRemote = new RemoteControl(tv);
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.channelUp();
        tvRemote.togglePower();

        System.out.println("\n---");

        Device radio = new Radio();
        System.out.println("\nControlling a Radio with an advanced remote");
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);
        radioRemote.togglePower();
        radioRemote.volumeDown();
        radioRemote.mute();
        radioRemote.togglePower();
    }
}
