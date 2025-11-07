package Second_Half.Observer.subscriber;

import Second_Half.Observer.publisher.YouTubeChannel;
import java.util.ArrayList;
import java.util.List;

public class PremiumSubscriber implements Subscriber {
    private final String username;
    private final List<YouTubeChannel> subscriptions = new ArrayList<>();

    public PremiumSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("[premium notification] " + username + " received premium alert: " + channelName + " released '" + videoTitle + "' + Early Access link!");
    }

    @Override
    public void addSubscription(YouTubeChannel channel) {
        subscriptions.add(channel);
    }

    @Override
    public void removeSubscription(YouTubeChannel channel) {
        subscriptions.remove(channel);
    }

    @Override
    public List<YouTubeChannel> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
