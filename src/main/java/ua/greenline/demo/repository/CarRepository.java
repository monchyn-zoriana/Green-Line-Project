package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Car;
import ua.greenline.demo.entity.Condition;
import ua.greenline.demo.entity.Region;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Modifying
    @Query("update Car u set u.year= ?1, u.price= ?2, u.power= ?3, u.milleage= ?4, u.brand= ?5, u.condition= ?6 where u.id = ?7")
    void updateCar(Integer year, Integer price, Integer power, Integer milleage, Brand brand, Condition condition, Long carId);

}
