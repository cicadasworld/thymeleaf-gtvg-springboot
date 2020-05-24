package com.jin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {

    @GetMapping("/userprofile")
    public String getUserprofile() {
        return "userprofile";
    }
}
