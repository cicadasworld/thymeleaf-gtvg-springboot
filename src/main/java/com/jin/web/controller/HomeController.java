package com.jin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class HomeController {

    @GetMapping({"/", ""})
    public String home(Model model) {
        model.addAttribute("today", Calendar.getInstance());
        return "home";
    }
}
