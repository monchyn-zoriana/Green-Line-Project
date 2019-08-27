package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Brand;


@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

    @Modifying
    @Query("update Brand u set u.brand= ?1 where u.id = ?2")
    void updateBrand(String brand,  Long brandId);





}
