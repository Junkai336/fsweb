package com.example.member.controller;

import com.example.member.dto.MemberDTO;
import com.example.member.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor // MemberService에 대한 멤버를 사용 가능
@AllArgsConstructor
@NoArgsConstructor
public class MemberController {

    // 생성자 주입
    // 흠.. controller 내에서만 도는 service의 어떤 목적이 있는 듯?
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입 페이지 출력 요청?
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }


    // input name 값을 RequestParam에 받아온다.
    // html에서 controller로 정보를 가져오는 방법이다.
//    @PostMapping("/member/save")
//    public String save(@RequestParam("memberEmail") String memberEmail,
//                       @RequestParam("memberPassword") String memberPassword,
//                       @RequestParam("memberName") String memberName) {
//        System.out.println("MemberController.save");
//        System.out.println("memberEmail = " + memberEmail);
//        System.out.println("memberPassword = " + memberPassword);
//        System.out.println("memberName = " + memberName);
//        return "index";
//    }


    // 전체적인 흐름
    // Client(웹페이지) -> Controller에서 DTO로 받은 후 Service로 전달
    // -> Service에서 받은 후 Entity로 바꿔 Repository에 전달

    // save 메소드의 매개변수를 memberDTO로 교체.
    // memberService로 memberDTO를 전달
    @PostMapping("/member/save")
    // @ModelAttribute ?
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        // save 메소드!
        memberService.save(memberDTO);

        // 완료되면 인덱스 페이지로.
        return "index";
    }


}
