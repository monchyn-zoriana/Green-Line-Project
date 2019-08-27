package ua.greenline.demo.DTO;

public class CustomCarDTO {

    private Long id;

    private Integer year;
    private Integer price;
    private Integer power;
    private Integer milleage;
    private String brand;
    private String condition;
    private String image;
    private String gallery;

    public CustomCarDTO() {
    }

    public CustomCarDTO(Long id, Integer year, Integer price, Integer power, Integer milleage, String brand, String condition, String image, String gallery) {
        this.id = id;
        this.year = year;
        this.price = price;
        this.power = power;
        this.milleage = milleage;
        this.brand = brand;
        this.condition = condition;
        this.image = image;
        this.gallery = gallery;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }
}


