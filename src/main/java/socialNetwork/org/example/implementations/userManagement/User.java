package socialNetwork.org.example.implementations.userManagement;

import socialNetwork.org.example.abstracts.AbstractUser;

public class User extends AbstractUser {
    public User(String id, String name) {
        super(id, name);
    }

    @Override
    public void printUserDetails() {
        System.out.println("User ID: " + getId() + ", Name: " + getName());
    }
}