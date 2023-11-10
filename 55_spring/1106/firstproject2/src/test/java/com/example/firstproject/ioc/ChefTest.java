package com.example.firstproject.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {

    @Autowired
        IngredientFactory ingredientFactory = new IngredientFactory();

    @Autowired
        Chef chef;

    @Test
    void 돈가스_요리하기(){
        // 준비
        Chef chef = new Chef(ingredientFactory);
        String menu = "돈가스";
        // 수행
        String food = chef.cook(menu);
        // 예상
        String expected = "한돈 등심으로 만든 돈가스";
        // 검증
        assertEquals(expected,food);
        System.out.println(food);
        // 스테이크가 통과하면 돈가스 요리가 탈락함
    }

    @Test
    void 스테이크_요리하기(){
        // 준비
        IngredientFactory ingredientFactory = new IngredientFactory();
        Chef chef = new Chef(ingredientFactory);
        String menu = "스테이크";
        // 수행
        String food = chef.cook(menu);
        // 예상
        String expected = "한우 꽃등심으로 만든 스테이크";
        // 검증
        assertEquals(expected,food);
        System.out.println(food);

        }

        @Test
        void 크리스피_치킨_요리하기() {
        IngredientFactory ingredientFactory = new IngredientFactory();
        Chef chef = new Chef(ingredientFactory);
        String menu = "크리스피치킨";
        String food = chef.cook(menu);
        String expected = "국내산 10호 닭으로 만든 크리스피치킨";
        assertEquals(expected,food);
        System.out.println(food);
    }
}

// 세프 클래스에서 직접 재료를 만들고 있는데 - 재료를 계속 바꿔줘야 함
// 재료 공장에서 재료를 조달 받을 수 있도록 ingredientFactory

// IngredientFactory 에서는 전달한 문자열에 따라
// 적합한 재료를 반환하도록 한다.
// Pork 와 Beef 는 Ingredient를 상속한다.

// 객체간 의존성이 높은 코드 : 요구사항 변경에 취약함
// DI로 코드 개선 : 외부의 요구사항이 변경되어도 내부의 코드 변경 안해도 된다

// IOC 컨테이너에 필요한 객체를
// @Component 로 등록하고 @Autowired 를 통해 가져온다.


