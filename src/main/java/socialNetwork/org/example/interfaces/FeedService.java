package socialNetwork.org.example.interfaces;

import java.util.List;

public interface FeedService {
    List<String> getUserFeed(String userId);
}