package com.example.firstproject.controller;


import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepositoty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private  final MemberRepositoty memberRepositoty;

    @GetMapping("/signup")
    public String signUppage(){
        return "members/new";
    }
    @PostMapping("/join")
    public String join(MemberForm memberForm){
        //System.out.println(memberForm.toString());
        log.info(memberForm.toString());
        Member member = memberForm.toEntity();
        //System.out.println(member.toString());
        log.info(member.toString());
        Member saved = memberRepositoty.save(member);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }
    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model){
        Member member = memberRepositoty.findById(id).orElse(null);
        model.addAttribute("member",member);
        return "members/show";
    }
    @GetMapping("/members")
    public String index(Model model){
       Iterable<Member> members = memberRepositoty.findAll();
       model.addAttribute("members",members);
       return "members/index";
    }



}
