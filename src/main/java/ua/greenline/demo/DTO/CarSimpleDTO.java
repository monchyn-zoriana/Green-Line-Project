package ua.greenline.demo.DTO;

import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Condition;

public class CarSimpleDTO {

    private Long id;

    private Integer year;
    private Integer price;
    private Integer power;
    private Integer milleage;
    private Brand brand;
    private Condition condition;
    private String region;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
