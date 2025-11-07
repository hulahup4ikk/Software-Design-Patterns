package Second_Half.Observer.subscriber;

import Second_Half.Observer.publisher.YouTubeChannel;
import java.util.List;

public interface Subscriber {
    void update(String channelName, String videoTitle);
    void addSubscription(YouTubeChannel channel);
    void removeSubscription(YouTubeChannel channel);
    List<YouTubeChannel> getSubscriptions();
    String getUsername();
}
