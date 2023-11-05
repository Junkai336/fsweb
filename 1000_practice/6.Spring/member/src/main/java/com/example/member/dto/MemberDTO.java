package com.example.member.dto;

import com.example.member.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// lombok 어노테이션으로 getter, setter, 생성자, toString 메소드 생략 가능
@ToString
@RequiredArgsConstructor
public class MemberDTO {
    // 회원정보를 필드로 정의
    // memberController의 매개변수들과 연동이 되는가?
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public MemberDTO() {}

    public MemberDTO(Long id, String memberEmail, String memberPassword, String memberName) {
        this.id = id;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
    }

    public Long getId(Long id) {
        return id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // Entity에 저장된 내용을 DTO로 지정하는 듯 하고, 목적은 엔티티 저장 내용에 대한 데이터 전송인 듯 함.
    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());

        // return은 왜 쓰는지 모르겠음
        return memberDTO;
    }

}
