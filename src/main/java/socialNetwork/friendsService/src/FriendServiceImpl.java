package socialNetwork.friendsService.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendServiceImpl implements FriendService {

    private final Map<String, List<String>> friendsMap = new HashMap<>();

    @Override
    public void addFriend(String userID, String friendID) {
        friendsMap.putIfAbsent(userID, new ArrayList<>());
        friendsMap.get(userID).add(friendID);
    }

    @Override
    public void removeFriend(String userID, String friendID) {
        if (friendsMap.containsKey(userID)) {
            friendsMap.get(userID).remove(friendID);
        }
    }

    @Override
    public List<String> getFriends(String userID) {
        return friendsMap.getOrDefault(userID, new ArrayList<>());
    }
}
