package ua.greenline.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.greenline.demo.DTO.ImageDTO;
import ua.greenline.demo.DTO.UserFullDTO;

@RestController
@CrossOrigin
public class ImageController {

    @PostMapping("/image/save")
    public void addImage(@RequestBody ImageDTO imageDTO)  {

    }
}
