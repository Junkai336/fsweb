package com.shop.controller;

import com.shop.dto.ItemFormDto;
import com.shop.dto.ItemSearchDto;
import com.shop.entity.Item;
import com.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping(value = "/admin/item/new")
    public String itemForm(Model model) {
        model.addAttribute("itemFormDto", new ItemFormDto());
        return "item/itemForm";
    }

    @PostMapping(value = "/admin/item/new")
    public String itemNew(@Valid ItemFormDto itemFormDto, BindingResult bindingResult, Model model,
                          @RequestParam("itemImgFile") List<MultipartFile> itemImgFileList) {
        if (bindingResult.hasErrors()) {
            return "item/itemForm";
        }
        if (itemImgFileList.get(0).isEmpty() && itemFormDto.getId() == null) {
            model.addAttribute("errorMessage", "첫번째 상품 이미지는 필수 입력 값입니다.");
            return "item/itemForm";
        }
        try {
            itemService.saveItem(itemFormDto, itemImgFileList);
        } catch (Exception e) {
            model.addAttribute("errorMessage", "상품 등록 중 에러가 발생하였습니다.");
            return "item/itemForm";
        }
        return "redirect:/";
    }

    @GetMapping(value = "/admin/item/{itemId}")
    public String itemDtl(@PathVariable("itemId") Long itemId, Model model) {
        try {
            ItemFormDto itemFormDto = itemService.getItemDtl(itemId);
            model.addAttribute("itemFormDto", itemFormDto);
            // 조회한 상품데이터를 모델에 담아서 뷰로 전달
        } catch (EntityNotFoundException e) {
            model.addAttribute("errorMessage", "존재하지 않는 상품입니다.");
            model.addAttribute("itemFormDto", new ItemFormDto());
            // 상품 엔티티가 존재하지 않으면 에러 메시지를 담아서 상품 등록 페이지로 이동
            return "item/itemForm";
        }
        return "item/itemForm";

    }

    @PostMapping(value = "/admin/item/{itemId}")
    public String itemUpdate (@Valid ItemFormDto itemFormDto, BindingResult bindingResult,
                              @RequestParam("itemImgFile") List<MultipartFile> itemImgFileList, Model model) {
        if (bindingResult.hasErrors()) {
            return "item/itemForm";
        }
        if (itemImgFileList.get(0).isEmpty() && itemFormDto.getId() == null) {
            model.addAttribute("errorMessage", "첫번째 상품 이미지는 필수 입력 값입니다.");
            return "item/itemForm";
        }
        try {
            itemService.saveItem(itemFormDto, itemImgFileList);
            // itemFormDto - 상품정보 itemImgFileList - 상품이미지정보
        } catch (Exception e) {
            model.addAttribute("errorMessage", "상품 등록 중 에러가 발생하였습니다.");
            return "item/itemForm";
        }
        return "redirect:/";
    }

    @GetMapping(value = {"/admin/items","admin/items/{page}"})
    public String itemManage(ItemSearchDto itemSearchDto, @PathVariable("page")Optional<Integer> page, Model model) {
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 3);
        // PageRequest - Data jpa 에서 사용하는 페이지 요청 객체
        // of() 메소드를 사용하여 페이지 번호와 페이지당 항목 수 지정하여 페이지 요청 정보생성
        // 0은 url 경로에서 받아온 페이지 번호를 확인하고 값이 없으면 0
        // 3은 한 페이지당 보여줄 항목수

        Page<Item> items = itemService.getAdminItemPage(itemSearchDto, pageable);
        // itemSearchDto를 사용하여 페이ㅣ 네이션 된 데이터를 조회
        model.addAttribute("items", items); // 조회도니 페이지 네이션된 데이터 모델 추가
        model.addAttribute("itemSearchDto", itemSearchDto); // 검색조건 모델에 추가
        model.addAttribute("maxPage", 5);
        // 한번에 표시할 최대 페이지수를 모델에 추가
        // 이 값을 템플릿에서 사용하여 페이지 네이션 UI를 그릴 때 (렌더링) 활용
        return "item/itemMng";
    }

}


