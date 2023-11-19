package com.example.hellopractice1.service;

import com.example.hellopractice1.domain.Member;
import com.example.hellopractice1.repository.MemberRepository;
import com.example.hellopractice1.repository.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    // 이건 안되나?
//    private final MemoryMemberRepository memoryMemberRepository;
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public Long join(Member member) {
        validateDuplicateMember(member);
    }

}
