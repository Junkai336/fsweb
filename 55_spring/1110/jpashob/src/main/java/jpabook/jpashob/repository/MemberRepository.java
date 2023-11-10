package jpabook.jpashob.repository;


import jpabook.jpashob.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member); // save
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
