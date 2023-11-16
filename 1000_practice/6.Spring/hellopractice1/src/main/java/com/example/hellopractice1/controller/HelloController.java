package com.example.hellopractice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String toHello(Model model) {
        model.addAttribute("gogo", "model.addAttribute");
        return "/hello";
    }

}
