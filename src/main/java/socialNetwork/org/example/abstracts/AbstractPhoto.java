package socialNetwork.org.example.abstracts;

public abstract class AbstractPhoto {
    private String id;
    private String url;

    public AbstractPhoto(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}