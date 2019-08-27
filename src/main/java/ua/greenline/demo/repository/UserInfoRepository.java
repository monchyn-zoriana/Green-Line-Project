package ua.greenline.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.greenline.demo.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
}
