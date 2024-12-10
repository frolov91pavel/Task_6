import org.junit.jupiter.api.Test;
import socialNetwork.friendsService.src.FriendServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FriendServiceImplTest {
    @Test
    void testAddAndGetFriends() {
        FriendServiceImpl friendService = new FriendServiceImpl();
        friendService.addFriend("user1", "user2");
        List<String> friends = friendService.getFriends("user1");

        assertEquals(1, friends.size());
    }
}
