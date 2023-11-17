package com.shop.controller;

import com.shop.dto.ItemDto;
import com.shop.entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="thymeleaf") // 공통으로 이 것을 붙이고 싶다. // 앞에 붙음
public class ThymeleafExController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model) {
        model.addAttribute("data", "타임리프");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model) {
        // 1. itemDto 객체 만들기
        ItemDto item = new ItemDto();

        // setter 이용하여 - ItemDetail 상품 상세 설명
        // ItemNm - 테스트 상품1
        // Price - 10000
        // RegTime LocalDateTime.now() 넣어서
        item.setItemNm("테스트 상품1");
        item.setItemDetail("상품 상세 설명");
        item.setRegTime(LocalDateTime.now());
        item.setPrice(10000);

        model.addAttribute("name", "상품명 : " + item.getItemNm());
        model.addAttribute("detail", "상품상세설명 : " + item.getItemDetail());
        model.addAttribute("regtime", "상품등록일 : " + item.getPrice());
        model.addAttribute("price", "상품가격 : " + item.getRegTime());

        model.addAttribute("item", item);

        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping(value = "/ex03")
    public String thymeleafExample03(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명" + i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(10000 + i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
            model.addAttribute("item", itemDtoList);

            return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafExample04(Model model) {
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(int i=1; i<=10;i++){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세 설명"+ i);
            itemDto.setItemNm("테스트 상품" + i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);

        return "thymeleafEx/thymeleafEx04";
    }

    @GetMapping(value = "/ex05")
    public String thymeleafExample05() {
        return "thymeleafEx/thymeleafEx05";
    }

    @GetMapping(value = "/ex06")
    public String thymeleafExample06(String param1, String param2, Model model) {
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx/thymeleafEx06";
    }

    @GetMapping(value = "/ex07")
    public String thymeleafExample07() {
        return "thymeleafEx/thymeleafEx07";
    }

}
