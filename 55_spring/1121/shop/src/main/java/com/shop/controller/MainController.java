package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String main(Principal principal, Model model)
    {
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        return "main";
    }

}
