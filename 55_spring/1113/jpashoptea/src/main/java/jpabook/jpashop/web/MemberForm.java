package jpabook.jpashop.web;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Member;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberForm {
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;
    private String city;
    private String street;
    private String zipcode;


//    public static Member createMember (MemberForm form) {
//    Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());
//
//    Member member = new Member();
//    member.setName(form.getName());
//    member.setAddress(address);
//
//    return member;
//    }


}

// @NotEmpty
// null 안되고 "" 빈문자열 안됨 공백문자도 안됨

// cf 매개변수로 클래스를 받아오면 클래스.메소드() 이런 식으로 쓸 수 있다. 매개변수로 안받아오면 일일이 지정해야 해서 통쨰로 받아오고 쓰는건 쓰고 버리는 건 버린다.