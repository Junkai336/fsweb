package com.example.member.repository;

import com.example.member.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository extends JpaRepository<MemberEntity, Long> {

}
