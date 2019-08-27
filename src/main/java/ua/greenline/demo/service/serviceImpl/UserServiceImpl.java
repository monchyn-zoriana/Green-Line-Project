package ua.greenline.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.greenline.demo.DTO.UserSimpleDTO;
import ua.greenline.demo.entity.User;
import ua.greenline.demo.repository.UserRepository;
import ua.greenline.demo.service.UserService;
import ua.greenline.demo.utils.ObjectMapperUtils;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @Override
    public User save(UserSimpleDTO userSimpleDTO) throws Exception {
        User user = modelMapper.map(userSimpleDTO, User.class);
        List<User> userWithSameCredentials = userRepository
                .getAllByEmailAndPassword(user.getEmail(), user.getPassword());
        if(!userWithSameCredentials.isEmpty()) {
            throw new Exception("Credentials are busy. Please, try one more time " +
                    "with other email or password");
        }
        return userRepository.save(user);
    }

    @Override
    public User getOne(UserSimpleDTO userSimpleDTO) {
        return userRepository.findByEmailAndPassword(userSimpleDTO.getEmail(),
                userSimpleDTO.getPassword());
    }
}
