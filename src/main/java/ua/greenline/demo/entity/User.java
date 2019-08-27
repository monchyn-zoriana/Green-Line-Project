package ua.greenline.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @OneToOne
    private UserInfo userInfo;

    @ManyToMany(cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE})
    @JoinTable(name = "user_buy_cars",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "car_id") })
    private List<Car> buyCars = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<Car> getBuyCars() {
        return buyCars;
    }

    public void setBuyCars(List<Car> buyCars) {
        this.buyCars = buyCars;
    }

    public User(String email, String password, UserInfo userInfo, List<Car> buyCars) {
        this.email = email;
        this.password = password;
        this.userInfo = userInfo;
        this.buyCars = buyCars;
    }

    public User() {
    }
}
