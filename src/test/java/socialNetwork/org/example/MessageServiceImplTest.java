package socialNetwork.org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialNetwork.org.example.abstracts.AbstractMessage;
import socialNetwork.org.example.implementations.messaging.MessageServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceImplTest {
    private MessageServiceImpl messageService;

    @BeforeEach
    void setUp() {
        messageService = new MessageServiceImpl();
    }

    @Test
    void testSendMessage() {
        messageService.sendMessage("1", "2", "Hello");
        AbstractMessage message = messageService.getMessageById("1");
        assertEquals("Hello", message.getContent());
    }
}