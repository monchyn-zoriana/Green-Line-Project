package ua.greenline.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Gallery;
import ua.greenline.demo.service.BrandService;
import ua.greenline.demo.service.GalleryService;
import ua.greenline.demo.utils.ObjectMapperUtils;

@RestController
@CrossOrigin
public class GalleryController {

    @Autowired
    private GalleryService galleryService;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @PostMapping(value = "/gallery/save")
    public Gallery saveGallery(@RequestBody Gallery gallery) {
        return galleryService.saveGallery(gallery);
    }
}
