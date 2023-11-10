package com.example.firstproject.ioc;

public class IngredientFactory2 {
    public Ingredient2 get(String menu) {
        switch (menu){
//            case "돈가스" :
//                return new Pork("한돈 등심");
            case "스테이크" :
                return new Beef2("한우 꽃등심");
            default :
                return null;
        }
    }
}
