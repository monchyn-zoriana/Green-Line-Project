package ua.greenline.demo.service;

import ua.greenline.demo.DTO.UserSimpleDTO;
import ua.greenline.demo.entity.User;

public interface UserService {
    User save(UserSimpleDTO userSimpleDTO) throws Exception;

    User getOne(UserSimpleDTO userSimpleDTO);

}
