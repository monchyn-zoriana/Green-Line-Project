package ua.greenline.demo.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String region;
    @ManyToMany(cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "region_car",
            joinColumns = @JoinColumn (name ="region_id"),
            inverseJoinColumns = @JoinColumn (name = "car_id"))
     private List<Car> regionCars = new ArrayList<>();

    public Region() {
    }

    public Region(List<Car> regionCars) {
        this.regionCars = regionCars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Car> getRegionCars() {
        return regionCars;
    }

    public void setRegionCars(List<Car> regionCars) {
        this.regionCars = regionCars;
    }
}
