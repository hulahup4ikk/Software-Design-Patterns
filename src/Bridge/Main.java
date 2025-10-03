package Bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl tvRemote = new RemoteControl(tv);
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.channelUp();

        System.out.println("-----");

        Device radio = new Radio();
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);
        radioRemote.togglePower();
        radioRemote.volumeDown();
        radioRemote.mute();
    }
}
