package socialNetwork.org.example.interfaces;

import socialNetwork.org.example.abstracts.AbstractMessage;

public interface MessageService {
    void sendMessage(String fromUserId, String toUserId, String content);

    AbstractMessage getMessageById(String id);
}