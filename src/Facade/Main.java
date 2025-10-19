package Facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade home = new HomeTheaterFacade(tv, sound, lights);
        home.watchMovie();
        System.out.println("--------------------------------");
        home.endMovie();
    }
}
