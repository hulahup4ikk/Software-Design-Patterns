package Second_Half.Observer.app;

import Second_Half.Observer.publisher.YouTubeChannel;
import Second_Half.Observer.subscriber.*;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel tech = new YouTubeChannel("TechVision");
        YouTubeChannel gym = new YouTubeChannel("GymShark");
        YouTubeChannel games = new YouTubeChannel("GameHub");

        Subscriber alexUser = new RegularSubscriber("Alex");
        Subscriber ivanUser = new PremiumSubscriber("Ivan");
        Subscriber zhanibekUser = new RegularSubscriber("Zhanibek");

        tech.subscribe(alexUser);
        tech.subscribe(ivanUser);

        gym.subscribe(ivanUser);
        gym.subscribe(zhanibekUser);

        games.subscribe(alexUser);
        games.subscribe(ivanUser);
        games.subscribe(zhanibekUser);

        tech.uploadVideo("Top 5 AI Gadgets 2025");
        gym.uploadVideo("Full Body Home Workout Routine");
        games.uploadVideo("Best RPG Games Coming Soon");

        System.out.println("\n " + ivanUser.getUsername() + " is subscribed to:");
        ivanUser.getSubscriptions().forEach(c -> System.out.println("   * " + c.getName()));

        System.out.println("\n " + ivanUser.getUsername() + " decided to unsubscribe from TechVision...");
        tech.unsubscribe(ivanUser);

        tech.uploadVideo("Smart Glasses 2.0 Review");

        System.out.println("\n " + ivanUser.getUsername() + " is now subscribed to:");
        ivanUser.getSubscriptions().forEach(c -> System.out.println("   * " + c.getName()));
    }
}
