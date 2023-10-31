package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 메인페이지로 가면 메소드 실행, index를 반환해서 @GetMapping("templates/index")가 돼서 index로 가나봄
    // @GetMapping
    @GetMapping("/")
    public String index() {
        return "index";
    }




}
