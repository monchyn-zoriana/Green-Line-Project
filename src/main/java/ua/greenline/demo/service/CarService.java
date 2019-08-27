package ua.greenline.demo.service;


import ua.greenline.demo.DTO.CustomCarDTO;
import ua.greenline.demo.entity.Car;


import java.io.IOException;
import java.util.List;

public interface CarService {


   Car saveCar(CustomCarDTO car);

    List<Car> getAll();

    void delete(Long id);

   Car updateCar(Car car);

}
