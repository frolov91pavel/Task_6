package socialNetwork.org.example.implementations.photoService;

import socialNetwork.org.example.abstracts.AbstractPhoto;
import socialNetwork.org.example.interfaces.PhotoService;

import java.util.HashMap;
import java.util.Map;

public class PhotoServiceImpl implements PhotoService {
    private final Map<String, AbstractPhoto> photos = new HashMap<>();

    @Override
    public void uploadPhoto(String userId, String photoUrl) {
        String id = String.valueOf(photos.size() + 1);
        photos.put(id, new Photo(id, photoUrl));
    }

    @Override
    public AbstractPhoto getPhotoById(String id) {
        return photos.get(id);
    }
}