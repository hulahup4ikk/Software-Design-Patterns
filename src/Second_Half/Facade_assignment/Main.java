package Second_Half.Facade_assignment;

import Second_Half.Facade_assignment.Devices.Lights;
import Second_Half.Facade_assignment.Devices.SoundSystem;
import Second_Half.Facade_assignment.Devices.TV;
import Second_Half.Facade_assignment.Facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {

        HomeTheaterFacade home = new HomeTheaterFacade();
        home.setCurrentMovie("Avatar");
        home.watchMovie();
        printState(home);
        System.out.println("--------------------------------");
        home.endMovie();
        printState(home);
    }

    private static void printState(HomeTheaterFacade home) {
        TV tv = home.getTv();
        SoundSystem sound = home.getSound();
        Lights lights = home.getLights();

        String movie = home.getCurrentMovie();
        System.out.println("Current movie: " + (movie == null ? "None" : movie));
        System.out.println("TV -> powered: " + tv.isPoweredOn() + ", channel: " + tv.getChannel());
        System.out.println("Sound -> powered: " + sound.isPoweredOn() + ", mode: " + sound.getMode() + ", volume: " + sound.getVolume());
        System.out.println("Lights -> powered: " + lights.isPoweredOn() + ", brightness: " + lights.getBrightness());
    }
}
