package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ua.greenline.demo.entity.Gallery;

import ua.greenline.demo.repository.GalleryRepository;
import ua.greenline.demo.service.GalleryService;
@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;

    @Override
    public Gallery saveGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }
}
