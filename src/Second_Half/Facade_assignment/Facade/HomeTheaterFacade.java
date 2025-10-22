package Second_Half.Facade_assignment.Facade;

import Second_Half.Facade_assignment.Devices.Lights;
import Second_Half.Facade_assignment.Devices.SoundSystem;
import Second_Half.Facade_assignment.Devices.TV;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private Lights lights;
    private String currentMovie;

    public HomeTheaterFacade(TV tv, SoundSystem sound, Lights lights) {
        this.tv = tv;
        this.sound = sound;
        this.lights = lights;
        this.currentMovie = null;
    }

    public void watchMovie() {
        System.out.println("Preparing to watch a movie: " + getCurrentMovieDescription());
        lights.on();
        lights.setBrightness(20);

        tv.on();
        tv.setChannel(1);
        tv.setVolume(30);

        sound.on();
        sound.setMode("Surround");
        sound.setVolume(65);
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");
        tv.off();
        sound.off();

        lights.on();
        lights.setBrightness(100);
        currentMovie = null;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public SoundSystem getSound() {
        return sound;
    }

    public void setSound(SoundSystem sound) {
        this.sound = sound;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public String getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(String currentMovie) {
        this.currentMovie = currentMovie;
    }

    private String getCurrentMovieDescription() {
        return currentMovie == null || currentMovie.isBlank() ? "Unknown movie" : currentMovie;
    }
}
