package Second_Half.Observer.subscriber;

import Second_Half.Observer.publisher.YouTubeChannel;
import java.util.ArrayList;
import java.util.List;

public class RegularSubscriber implements Subscriber {
    private final String username;
    private final List<YouTubeChannel> subscriptions = new ArrayList<>();

    public RegularSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("[regular notification] " + username + " got notification: [" + channelName + "] " + videoTitle);
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
