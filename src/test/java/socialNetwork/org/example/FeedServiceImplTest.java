package socialNetwork.org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialNetwork.org.example.implementations.feed.FeedServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeedServiceImplTest {
    private FeedServiceImpl feedService;

    @BeforeEach
    void setUp() {
        feedService = new FeedServiceImpl();
    }

    @Test
    void testGetUserFeed() {
        List<String> feed = feedService.getUserFeed("1");
        assertEquals(3, feed.size());
    }
}