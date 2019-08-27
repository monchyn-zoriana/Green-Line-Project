package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Region;
@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    @Modifying
    @Query("update Region u set u.region= ?1 where u.id = ?2")
    void updateRegion(String region,  Long regionId);
}
