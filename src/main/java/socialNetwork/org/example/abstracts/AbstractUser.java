package socialNetwork.org.example.abstracts;

public abstract class AbstractUser {
    private String id;
    private String name;

    public AbstractUser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void printUserDetails();
}