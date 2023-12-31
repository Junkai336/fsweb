package com.example.ver1.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberDto {
    // ?? : 정규식 제대로 동작하는지 봐야 한다..

    // null, "" (초기화된 String 혹은 빈 문자열) , " " (공백) 허용하지 않음
    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String userName;

    // null, "" 허용하지 않음
    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    private String userEmail;

    // @Pattern : 정규식을 검사할 때 사용한다.
    // min, max = value 이하, 이상의 값만 허용한다.
    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해 주세요.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$)", message = "비밀번호는 영문 대소문자, 숫자, 특수문자를 사용해 주세요.")
    private String password;

    @NotEmpty(message = "핸드폰 번호는 필수 입력 값입니다.")
    private String userPhoneNumber;

    @NotEmpty(message = "주소지는 필수 입력 값입니다.")
    private String userAddress;

}

// https://dev-coco.tistory.com/123
// https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%95%EA%B7%9C%EC%8B%9DRegular-Expression-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%A0%95%EB%A6%AC#regex_%ED%8C%A8%ED%82%A4%EC%A7%80_%ED%81%B4%EB%9E%98%EC%8A%A4