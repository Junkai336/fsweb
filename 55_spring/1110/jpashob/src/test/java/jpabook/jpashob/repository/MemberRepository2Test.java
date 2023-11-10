package jpabook.jpashob.repository;

import jpabook.jpashob.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepository2Test {
    @Autowired
    MemberRepository2 memberRepository2;

    @Test
    @Transactional
    @Rollback(false)
    public void save() throws Exception {
        // given
//        Member member = new Member();
//        member.setUsername("memberA");
//        // when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//        // then
////        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        assertEquals(findMember.toString(), member.toString(), "일치하는지 출력");
//        System.out.println(findMember.toString() + member.toString());

        System.out.println("---------------------------------------------");

//        Member member = new Member();
//        member.setUsername("memberA");
//        Member savedMember = memberRepository2.save(member);
//        Member findMember = memberRepository2.findById(savedMember.getId()).orElse(null);
//        assertNotNull(findMember);
//        assertEquals(member.getId(), findMember.getId());
//        assertEquals(member.getUsername(), findMember.getUsername());
//        assertEquals(member.toString(), findMember.toString(), "일치하는지 출력");


        Member member2 = new Member(1L, "member11a");

        Member save2 = memberRepository2.save(member2);

        System.out.println(memberRepository2.findById(1L).orElse(null));

    }
}