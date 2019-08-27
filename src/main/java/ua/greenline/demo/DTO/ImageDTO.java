package ua.greenline.demo.DTO;

public class ImageDTO {

    private Long id;
    private String image;
    private String  gallery;

    public ImageDTO() {
    }

    public ImageDTO(Long id, String image, String gallery) {
        this.id = id;
        this.image = image;
        this.gallery = gallery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
