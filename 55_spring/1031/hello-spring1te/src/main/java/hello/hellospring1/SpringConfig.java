package hello.hellospring1;

import hello.hellospring1.repository.JdbcMemberRepository;
import hello.hellospring1.repository.MemberRepository;
import hello.hellospring1.repository.MemoryMemberRepository;
import hello.hellospring1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class SpringConfig {

    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Bean
    public MemberService memberservice () {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository();
    }

    //@Bean 등록한 경우
    //@Service @Repository와 @Autowired를 생략가능


}
