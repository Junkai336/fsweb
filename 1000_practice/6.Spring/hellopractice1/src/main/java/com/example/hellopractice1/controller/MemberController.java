package com.example.hellopractice1.controller;

import com.example.hellopractice1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    // 컨트롤러가 정적 컨텐츠보다 우선순위가 높음
    @GetMapping(value = "/")
    public String home () {
        return "home";
    }

    // a태그로 member/new로 오면 createMemberForm.html로 가게 한다. (다이렉트로 안하는 이유는 잘 모르겠음)
    // createMemberform에서 form_action으로 form에 작성한 데이터는 member/new로 간다. (submit 타입의 button 누르면 전송되는 듯)
    // => new에서 다 처리하려고 하는 듯?
    @GetMapping(value = "/member/new")
    public String createForm() {
        return "member/createMemberForm";
    }

    @PostMapping(value = "/member/new")
    public String createMember() {
        return null;
    }



    // 회원목록으로~
    @GetMapping(value = "/member/list")
    public String list(Model model) {

        return null;
    }


}
