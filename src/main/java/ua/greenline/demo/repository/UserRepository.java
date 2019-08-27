package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getAllByEmailAndPassword(String email, String password);

    @Query("Select u from User u where email=:email and password=:pass")
    User findByEmailAndPassword(@Param("email") String email, @Param("pass") String pass);


}
