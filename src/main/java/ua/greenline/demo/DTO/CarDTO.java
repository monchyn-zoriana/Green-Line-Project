package ua.greenline.demo.DTO;

public class CarDTO {
    private Long id;

    private Integer year;
    private Integer price;
    private Integer power;
    private Integer milleage;

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
}
