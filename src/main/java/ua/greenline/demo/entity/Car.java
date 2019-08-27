package ua.greenline.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer year;
    private Integer price;
    private Integer power;
    private Integer milleage;


    @ManyToOne
    private Brand brand;

    @OneToOne
    private Condition condition;

    @ManyToMany(mappedBy = "regionCars")
    private List<Region> regions = new ArrayList<>();

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Gallery gallery;

    public Car(Integer year, Integer price, Integer power, Integer milleage, Brand brand, Condition condition, List<Region> regions, Gallery gallery) {
        this.year = year;
        this.price = price;
        this.power = power;
        this.milleage = milleage;
        this.brand = brand;
        this.condition = condition;
        this.regions = regions;
        this.gallery = gallery;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getMilleage() {
        return milleage;
    }

    public void setMilleage(Integer milleage) {
        this.milleage = milleage;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }
}
