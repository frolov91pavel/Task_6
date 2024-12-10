package socialNetwork.org.example.implementations.feed;

import socialNetwork.org.example.interfaces.FeedService;

import java.util.Arrays;
import java.util.List;

public class FeedServiceImpl implements FeedService {
    @Override
    public List<String> getUserFeed(String userId) {
        return Arrays.asList("Post 1", "Post 2", "Post 3");
    }
}