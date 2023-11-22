package com.example.hellopractice1;

import com.example.hellopractice1.repository.JdbcMemberRepository;
import com.example.hellopractice1.repository.MemberRepository;
import com.example.hellopractice1.repository.MemoryMemberRepository;
import com.example.hellopractice1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


// 이 클래스의 목적은 뭐임? 불러오는 곳도 없고 정의만 해놨는데.

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
//    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        // return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }
}
