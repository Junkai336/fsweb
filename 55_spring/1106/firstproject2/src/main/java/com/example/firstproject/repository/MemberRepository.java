package com.example.firstproject.repository;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface MemberRepository extends CrudRepository<Member, Long> {
    // CrudRepository에서 findAll의 타입은 Iterable<T>
//    @Override
//    ArrayList<Member> findAll();


}
