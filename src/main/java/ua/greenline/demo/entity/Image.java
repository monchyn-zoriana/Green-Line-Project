package ua.greenline.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="image")
public class Image {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;


    @ManyToOne
    @JoinColumn(name = "gallery_id")
    private Gallery gallery;

    public Image() {
    }

    public Image(String image, Gallery gallery) {
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

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }
}
