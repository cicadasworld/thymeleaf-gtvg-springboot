package com.jin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscribeController {

    @GetMapping("/subscribe")
    public String subscribe() {
        return "subscribe";
    }
}
