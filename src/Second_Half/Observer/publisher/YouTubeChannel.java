package Second_Half.Observer.publisher;

import Second_Half.Observer.subscriber.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        s.addSubscription(this);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        s.removeSubscription(this);
    }

    public void uploadVideo(String title) {
        System.out.println("\n Channel " + name + " uploaded a new video: " + title);
        notifySubscribers(title);
    }

    private void notifySubscribers(String videoTitle) {
        /*
        for (Subscriber s : subscribers) {
            s.update(name, videoTitle);
        }
        */
        for (int i = subscribers.size()-1; i >= 0; i--) {
            Subscriber s = subscribers.get(i);
            s.update(name, videoTitle);
        }
    }

    public String getName() {
        return name;
    }
}
