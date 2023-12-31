package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 상품코드

    @Column(nullable = false, length = 50)
    private String itemNm; // 상품명
    // null을 허용하지 않고 (값이 없는걸 허용하지 않는다.) = itemNm 필드는 항상 값을 가져야 한다.
    // 최대 50자

    @Column(nullable = false)
    private int price; // 가격

    @Column(nullable = false)
    private int stockNumber; // 재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail; // 상품상세
    // @Lob - 대용량의 데이터를 저장

    private ItemSellStatus itemSellStatus;

    private LocalDateTime regTime; // 등록시간

    private LocalDateTime updateTime; // 수정시간

}
