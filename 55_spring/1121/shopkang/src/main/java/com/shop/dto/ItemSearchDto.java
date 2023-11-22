package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

    // 1. 현재 시간과 상품 등록일을 비교해서 상품 데이터 조회
// a:: 상품 등록일 전체
    // 1d 최근하루
    // 1w 하루 일주일
    // 1m 최근한달 6m

    // 2.상품 판매상태
    //


}
