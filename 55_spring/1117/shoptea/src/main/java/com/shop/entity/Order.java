package com.shop.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.shop.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime orderDate; // 주문일

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; // 주문 상태

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();
    // 한 번의 주문에 여러 개의 상품을 주문할 수 있으므로
    // 주문 상품 엔티티와 주문 엔티티를 다대일 단방향 매핑
    // 외래키(order_id) 가 order_item 테이블에 있으므로 연관관계의 주인은 OrderItem
    // OrderItem 에 Order 에 의해서 관리된다.

    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
