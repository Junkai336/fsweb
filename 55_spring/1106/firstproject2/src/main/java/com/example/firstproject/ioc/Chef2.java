package com.example.firstproject.ioc;

public class Chef2 {



    // 셰프는 식재료 공장을 알고있음
    private IngredientFactory ingredientFactory;
    //셰프가 식재료 공장과 협업하기 위해 DI
    public Chef2(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public String cook(String menu) {
        //셰프는 식재료 공장을 알고 있음

        //재료 준비
        //Pork pork = new Pork("한돈 등심");
       // Beef beef = new Beef("한우 꽃등심");
     Ingredient ingredient = ingredientFactory.get(menu);
        //요리반환
        //return pork.getName()+"으로 만든 "+ menu;
        //return beef.getName()+"으로 만든 "+ menu;
        return ingredient.getName()+"으로 만든 "+ menu;
    }
}
