package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;
import sun.misc.MessageUtils;
import ua.greenline.demo.DTO.CustomCarDTO;
import ua.greenline.demo.DTO.MyMultipartFile;
import ua.greenline.demo.entity.*;
import ua.greenline.demo.repository.*;

import ua.greenline.demo.service.CarService;

import javax.transaction.Transactional;
import java.io.*;
import java.util.List;
import java.util.UUID;


@Service
public class CarServiseImpl implements CarService {


    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private GalleryRepository galleryRepository;
    @Autowired
    private ConditionRepository conditionRepository;

    @Autowired
    private BrandRepository brandRepository;

    public Car saveCar(CustomCarDTO customCarDTO)  {

//        BASE64Decoder base64Decoder = new BASE64Decoder();
//        byte[] fileContent = base64Decoder.decodeBuffer(customCarDTO
//                .getImage().split(",")[1]);
//
//        String extension = customCarDTO
//                .getImage()
//                .split(",")[0]
//                .split("/")[1]
//                .split(";")[0];


//        String name = UUID.randomUUID().toString();

//        MyMultipartFile myMultipartFile =
//                new MyMultipartFile(name, extension, fileContent);
//        saveOnMachine(myMultipartFile);

        Brand brand = new Brand();
        brand.setId(customCarDTO.getId());
        brand.setBrand(customCarDTO.getBrand());

        Brand savedBrand = brandRepository.save(brand);


        Condition condition = new Condition();
        condition.setId(customCarDTO.getId());
        condition.setConditionCar(customCarDTO.getCondition());

        Condition savedCondition = conditionRepository.save(condition);

//        Image image = new Image();
//        image.setId(customCarDTO.getId());
//        image.setImage(name + "." + extension);
//
//        Image savedImage = imageRepository.save(image);

//        Gallery gallery = new Gallery();
//        gallery.setId(customCarDTO.getId());
//        gallery.setImage(customCarDTO.getImage());


//        Gallery savedGallery = galleryRepository.save(gallery);


        Car car = new Car();
        car.setBrand(savedBrand);
        car.setCondition(savedCondition);
//        car.setGallery(savedGallery);
        car.setYear(customCarDTO.getYear());
        car.setPrice(customCarDTO.getPrice());
        car.setPower(customCarDTO.getPower());
        car.setMilleage(customCarDTO.getMilleage());
        car.setId(customCarDTO.getId());


        //modelMapper.map(carSimpleDTO, Car.class);
        return carRepository.save(car);


    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Car updateCar(Car car) {
        carRepository.updateCar(car.getYear(), car.getPrice(), car.getPower(), car.getMilleage(), car.getBrand(), car.getCondition(), car.getId());
        return carRepository.getOne(car.getId());
    }

    private void saveOnMachine(MultipartFile multipartFile) throws IOException {

        String PATH = "C:/Users/Asus/Desktop/01.04/images";
        File folder = new File(PATH);

        if (folder.exists()) {
            folder.mkdirs();

        }
        File newMultipartFile = new File
                (PATH + "/" + multipartFile.getOriginalFilename());

        OutputStream ous = new FileOutputStream(newMultipartFile);

        BufferedOutputStream buf = new BufferedOutputStream(ous);
        buf.write(multipartFile.getBytes(), 0, multipartFile.getBytes().length);
        buf.flush();
    }
}
