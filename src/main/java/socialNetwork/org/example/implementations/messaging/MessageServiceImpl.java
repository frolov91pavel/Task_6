package socialNetwork.org.example.implementations.messaging;

import socialNetwork.org.example.abstracts.AbstractMessage;
import socialNetwork.org.example.interfaces.MessageService;

import java.util.HashMap;
import java.util.Map;

public class MessageServiceImpl implements MessageService {
    private final Map<String, AbstractMessage> messages = new HashMap<>();

    @Override
    public void sendMessage(String fromUserId, String toUserId, String content) {
        String id = String.valueOf(messages.size() + 1);
        messages.put(id, new Message(id, content));
    }

    @Override
    public AbstractMessage getMessageById(String id) {
        return messages.get(id);
    }
}