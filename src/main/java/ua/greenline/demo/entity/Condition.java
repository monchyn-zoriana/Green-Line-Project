package ua.greenline.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="conditionTable")
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conditionCar;

    @OneToOne(mappedBy = "condition")
    private Car car;

    public Condition() {
    }

    public Condition(String conditionCar) {
        this.conditionCar = conditionCar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConditionCar() {
        return conditionCar;
    }

    public void setConditionCar(String conditionCar) {
        this.conditionCar = conditionCar;
    }
        public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
