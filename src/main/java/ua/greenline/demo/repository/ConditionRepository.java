package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Condition;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {

    @Modifying
    @Query("update Condition u set u.conditionCar= ?1 where u.id = ?2")
    void updateCondition(String condition,  Long conditionId);

}
