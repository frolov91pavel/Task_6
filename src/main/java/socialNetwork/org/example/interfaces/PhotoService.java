package socialNetwork.org.example.interfaces;

import socialNetwork.org.example.abstracts.AbstractPhoto;

public interface PhotoService {
    void uploadPhoto(String userId, String photoUrl);

    AbstractPhoto getPhotoById(String id);
}