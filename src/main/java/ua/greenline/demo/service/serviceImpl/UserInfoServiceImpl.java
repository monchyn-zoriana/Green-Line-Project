package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.greenline.demo.DTO.UserFullDTO;
import ua.greenline.demo.entity.User;
import ua.greenline.demo.entity.UserInfo;
import ua.greenline.demo.repository.UserInfoRepository;
import ua.greenline.demo.repository.UserRepository;
import ua.greenline.demo.service.UserInfoService;
import ua.greenline.demo.utils.ObjectMapperUtils;

import java.util.logging.LogManager;
import java.util.logging.Logger;


@Service
public class UserInfoServiceImpl implements UserInfoService {

//   private static final Logger LOGGER = LogManager
//           .getLogger(UserInfoServiceImpl.class.getName());


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapperUtils modelMapper;

//    @Autowired
//    private PaswordEncoder passwordEncoder;

@Autowired
private UserInfoRepository userInfoRepository;

    @Override
    public void addUserInfo(UserFullDTO userFullDTO) {

        UserInfo userInfo = new UserInfo();
        userInfo.setBirthDate(userFullDTO.getDateBirth());
        userInfo.setName(userFullDTO.getName());

        User user = userRepository.findById(userFullDTO.getId()).get();

        if (user!= null){
            if(user.getUserInfo()  != null){

                userInfo.setId(user.getUserInfo().getId());
            }

            userInfo.setUser(user);
            userInfoRepository.save(userInfo);
            user.setUserInfo(userInfo);
            userRepository.save(user);
        }
    }
}
