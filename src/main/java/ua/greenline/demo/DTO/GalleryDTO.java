package ua.greenline.demo.DTO;

public class GalleryDTO {

    private long id;
    private String image;
    private String  car;

    public GalleryDTO() {
    }

    public GalleryDTO(long id, String image, String car) {
        this.id = id;
        this.image = image;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
