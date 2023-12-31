package com.example.ver1.repository;

import com.example.ver1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByUserEmail(String userEmail);

}
