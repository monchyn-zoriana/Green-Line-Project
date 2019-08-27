package ua.greenline.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.greenline.demo.DTO.UserFullDTO;
import ua.greenline.demo.DTO.UserSimpleDTO;
import ua.greenline.demo.entity.User;
import ua.greenline.demo.service.UserInfoService;
import ua.greenline.demo.service.UserService;
import ua.greenline.demo.utils.ObjectMapperUtils;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ObjectMapperUtils modelMapper;

    @Autowired
    private UserInfoService userInfoService;


    @PostMapping("/register")
    public User saveUser(@RequestBody User user) throws Exception {
        return userService.save(modelMapper.map(user, UserSimpleDTO.class));
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) throws Exception {
        User user1 = userService.getOne(modelMapper.map(user, UserSimpleDTO.class));
        if (user1 == null) {
            throw new Exception("User with such creds doesn`t exists");
        }
        return user1;
    }

    @PostMapping("/user-info/save")
    public void addUserInfo(@RequestBody UserFullDTO userFullDTO)  {
        userInfoService.addUserInfo(userFullDTO);
    }


}



