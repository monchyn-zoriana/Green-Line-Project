package ua.greenline.demo.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;

   @OneToMany
    private List<Car> list = new ArrayList<>();

    public Brand() {
    }

    public Brand(String brand, List<Car> list) {
        this.brand = brand;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }
}

