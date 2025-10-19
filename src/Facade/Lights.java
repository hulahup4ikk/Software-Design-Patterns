package Facade;

public class Lights implements IDevice {
    @Override
    public void on() {
        System.out.println("Lights are on");
    }

    @Override
    public void off() {
        System.out.println("Lights are off");
    }
}
