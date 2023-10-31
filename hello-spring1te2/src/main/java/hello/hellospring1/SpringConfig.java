package hello.hellospring1;


import hello.hellospring1.repository.JdbcMemberRepository;
import hello.hellospring1.repository.MemberRepository;
import hello.hellospring1.repository.MemoryMemberRepository;
import hello.hellospring1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    private final EntityManager em;
    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em= em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
    //@Bean 등록 한 경우
    //@Service @Repository와 #AutoWired를 생략가능

}
