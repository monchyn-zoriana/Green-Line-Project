package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {
}
