package ua.greenline.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="gallery")
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String image;


    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToMany
    private List<Image> list = new ArrayList<>();


    public Gallery() {
    }

    public Gallery(String image, Car car, List<Image> list) {
        this.image = image;
        this.car = car;
        this.list = list;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Image> getList() {
        return list;
    }

    public void setList(List<Image> list) {
        this.list = list;
    }
}
