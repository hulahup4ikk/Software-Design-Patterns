package Facade;

public class SoundSystem implements IDevice {
    @Override
    public void on() {
        System.out.println("Sound system is on");
    }

    @Override
    public void off() {
        System.out.println("Sound system is off");
    }
}
