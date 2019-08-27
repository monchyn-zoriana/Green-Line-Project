package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Brand;
import ua.greenline.demo.entity.Image;
@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}