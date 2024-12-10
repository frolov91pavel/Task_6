package socialNetwork.org.example.interfaces;

import socialNetwork.org.example.abstracts.AbstractUser;

public interface UserService {
    void addUser(String name);

    AbstractUser getUserById(String id);
}