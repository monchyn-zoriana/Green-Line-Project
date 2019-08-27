package ua.greenline.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import ua.greenline.demo.service.UserService;

@Controller

public class RootController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String returnMainPage() {
        return "home";
    }

    @GetMapping("/home")
    public String returnHomePage(){
        return"home";
    }

    @GetMapping("/electro-car")
    public String returnCarPage(){
        return"addCar";
    }

    @GetMapping("/register")
    public String returnRegisterPage() {
        return "registerForm";
    }


    @GetMapping("/catalog-auto")
    public String returnCatalogAutoPage() {
        return "catalogAuto";
    }

    @GetMapping("/contacts")
    public String returnContactsPage() {
        return "contacts";
    }
    @GetMapping("/payment-and-delivery")
    public String returnDeliveryPage() {
        return "delivery";
    }

}


