package socialNetwork.org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import socialNetwork.org.example.abstracts.AbstractUser;
import socialNetwork.org.example.implementations.userManagement.User;
import socialNetwork.org.example.interfaces.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserServiceMockTest {
    @Test
    void testMockedUserService() {
        UserService mockUserService = Mockito.mock(UserService.class);

        AbstractUser mockUser = new User("1", "Mocked User");
        when(mockUserService.getUserById("1")).thenReturn(mockUser);

        AbstractUser user = mockUserService.getUserById("1");
        assertEquals("Mocked User", user.getName());
    }
}