package ua.greenline.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.greenline.demo.DTO.CustomCarDTO;

import ua.greenline.demo.entity.Car;

import ua.greenline.demo.service.CarService;
import ua.greenline.demo.utils.ObjectMapperUtils;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin

public class CarController {


    @Autowired
    private CarService carService;


    @Autowired
    private ObjectMapperUtils modelMapper;

    @PostMapping(value = "/car")
    public Car saveCar(@RequestBody CustomCarDTO customCarDTO) {
        return carService.saveCar(customCarDTO);
    }


    @GetMapping(value = "/cars")
    public List<Car> getAllCars() {

        return carService.getAll();
    }

    @DeleteMapping(value = "/car/{id}")
    public void getAllCars(@PathVariable Long id) {
        carService.delete(id);
    }

    @PutMapping("/car")
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }


}
