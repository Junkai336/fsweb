package hello.hellospring1.repository;

import hello.hellospring1.domain.Member;

import javax.persistence.EntityManager;
import java.util.Optional;

public class JpaMemberRepository {
    public class JpaMemberRepository implements MemberRepository {
        private final EntityManager em;

        public JpaMemberRepositoryMemberRepository(EntityManager em) {
            this.em = em;
        }

        @Override
        public Member save(Member member) {
            em.persist(membe) //persist 영구저ㅏㅇ 하라는 명령
            return member;
        }

        @Override
                    public Optional<Member> findById(Long id) {
                Member member = em.find(Member.class, id);
                return Optional.abNullable(member)
            }
            @Override
        public Optional<Member> findById(Long id) {
            Member member = em.find(Member.class, id);
            // EntityManager를 사용하여 Member 엔터티 클래스와 id를 사용해서 조화
            return Optional.ofNullalbe(member);
            }

            @Ouverride
        piblic Optional<Member> fina\jao
         List<Member> findByNmae(String name)





    }
}
