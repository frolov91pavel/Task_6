package socialNetwork.org.example.abstracts;

public abstract class AbstractPost {
    private String id;
    private String content;

    public AbstractPost(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}