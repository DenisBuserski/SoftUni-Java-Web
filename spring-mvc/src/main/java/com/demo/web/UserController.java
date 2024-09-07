package com.demo.web;

import com.demo.model.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String newUserForm() {
        return "newuserform.html";
    }

    @PostMapping
    public String createUser(UserDto userDto) {
        System.out.println(userDto);
        return "usercreated.html";
    }
}
