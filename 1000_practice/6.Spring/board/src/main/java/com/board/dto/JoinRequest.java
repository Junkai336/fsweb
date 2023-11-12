package com.board.dto;

import com.board.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
//@Builder
public class JoinRequest {

    @NotBlank(message = "로그인 아이디가 비어있습니다.")
    private String loginId;

    @NotBlank(message = "비밀번호가 비어있습니다.")
    private String password;
    private String passwordCheck;

    @NotBlank(message = "닉네임이 비어있습니다.")
    private String nickname;

    // builder 메소드는 사용자 정의 메소드가 아닌가 본데...
    public User toEntity() {
        return User.builder()
                .loginId(this.loginId)
                .password(this.password)
                .nickname(this.nickname)
                .build();
    }
}

// NotBlank? validation의 어노테이션인가봄?
// .builder 하고 . . . 계속 찍는게 무엇을 뜻하는지??