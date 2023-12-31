package jpabook.jpashob.repository;


import jpabook.jpashob.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;
    //EntityManagerFactory를 생성할 필요가 없다.
//    public  Long save(Member member) {
//        em.persist(member);//save
//        return member.getId();
//    }
//    public  Member find(Long id){
//        return em.find(Member.class, id);
//    }
    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m form member m", Member.class)
                .getResultList();
    }
    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name",name)
                .getResultList();
    }


}


