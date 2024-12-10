package socialNetwork.org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialNetwork.org.example.abstracts.AbstractPhoto;
import socialNetwork.org.example.implementations.photoService.PhotoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PhotoServiceImplTest {
    private PhotoServiceImpl photoService;

    @BeforeEach
    void setUp() {
        photoService = new PhotoServiceImpl();
    }

    @Test
    void testUploadPhoto() {
        photoService.uploadPhoto("1", "http://example.com/photo1.jpg");
        AbstractPhoto photo = photoService.getPhotoById("1");
        assertEquals("http://example.com/photo1.jpg", photo.getUrl());
    }

    @Test
    void testGetPhotoById_NotFound() {
        AbstractPhoto photo = photoService.getPhotoById("99");
        assertNull(photo);
    }
}