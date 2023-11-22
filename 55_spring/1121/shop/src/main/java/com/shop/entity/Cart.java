package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="cart")
@Getter
@Setter
@ToString
public class Cart extends BaseEntity{
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;
}
//매핑을 해주면
//장바구니 엔티르르 조회하면서 회원 엔티티
// 정보도 동시에 가져올수 있다.

//즉시로딩
// cart 테이블과 member 테이블을 조인해서 가져오는
//쿼리문이 실행
//cart 엔티티를 조회하면 member entity도 동시에 가여
//오는 것입니다.
//엔티티를 조회할때 해당 엔티티와매핑된 엔티티도 한 번에
//조회하는 것을 '즉시 로딩' 이라고 합니다.

