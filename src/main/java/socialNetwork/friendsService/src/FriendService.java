package socialNetwork.friendsService.src;

import java.util.List;

public interface FriendService {

    void addFriend(String userID, String friendID);
    void removeFriend(String userID, String friendID);
    List<String> getFriends(String userID);

}
