package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String greetings (Model model) {
        model.addAttribute("username", "허준");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeyouNext (Model model) {
        model.addAttribute("nickname", "홍길동");
         return "goodbye";
        }
    }


