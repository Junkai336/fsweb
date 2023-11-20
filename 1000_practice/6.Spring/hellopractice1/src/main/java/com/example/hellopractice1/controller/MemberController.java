package com.example.hellopractice1.controller;

import com.example.hellopractice1.repository.MemberRepository;
import com.example.hellopractice1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {

    //
    private final MemberService memberService;

}
