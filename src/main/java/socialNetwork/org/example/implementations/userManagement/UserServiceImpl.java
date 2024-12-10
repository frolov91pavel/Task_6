package socialNetwork.org.example.implementations.userManagement;

import socialNetwork.org.example.abstracts.AbstractUser;
import socialNetwork.org.example.interfaces.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private final Map<String, AbstractUser> users = new HashMap<>();

    @Override
    public void addUser(String name) {
        String id = String.valueOf(users.size() + 1);
        users.put(id, new User(id, name));
    }

    @Override
    public AbstractUser getUserById(String id) {
        return users.get(id);
    }
}