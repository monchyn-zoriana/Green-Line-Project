package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.greenline.demo.DTO.ImageDTO;

import ua.greenline.demo.entity.Gallery;
import ua.greenline.demo.entity.Image;

import ua.greenline.demo.repository.GalleryRepository;
import ua.greenline.demo.repository.ImageRepository;

import ua.greenline.demo.service.ImageService;
import ua.greenline.demo.utils.ObjectMapperUtils;

@Service
public class ImageDTOServiceImpl implements ImageService {
//    private static final Logger LOGGER = LogManager
////           .getLogger(UserInfoServiceImpl.class.getName());


    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private ObjectMapperUtils modelMapper;

//    @Autowired
//    private PaswordEncoder passwordEncoder;

    @Autowired
    private GalleryRepository galleryaRepository;

    @Override
    public void addImage(ImageDTO imageDTO) {

        Image image = new Image();
        image.setImage(image.getImage());


        Gallery gallery = galleryaRepository.findById(imageDTO.getId()).get();

        if (gallery!= null){
            if(gallery.getImage()  != null){

//                image.setId(gallery.getImage()).getId());
            }

            image.setGallery(gallery);
           imageRepository.save(image);
//            gallery.setImage(image);
           galleryaRepository.save(gallery);
        }
    }
}
