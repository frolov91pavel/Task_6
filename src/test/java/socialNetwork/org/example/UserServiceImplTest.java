package socialNetwork.org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialNetwork.org.example.abstracts.AbstractUser;
import socialNetwork.org.example.implementations.userManagement.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserServiceImplTest {
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
    }

    @Test
    void testAddUser() {
        userService.addUser("Alice");
        AbstractUser user = userService.getUserById("1");
        assertEquals("Alice", user.getName());
    }

    @Test
    void testGetUserById_NotFound() {
        AbstractUser user = userService.getUserById("99");
        assertNull(user);
    }
}