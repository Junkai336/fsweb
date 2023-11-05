package com.example.member.service;

import com.example.member.dto.MemberDTO;
import com.example.member.entity.MemberEntity;
import com.example.member.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class MemberService {

    // 먼저 jpa, mysql dependency 추가
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        // repository의 save 메소드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // Repository의 save 메소드 호출 (조건. entity 객체를 넘겨줘야 함)
    }

}
