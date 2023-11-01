package exam.ch7;

class Cat extends Animal {
    public void catMethod() {
        System.out.println("catmethod");
    }

}

class Animal {
    public void animalMethod() {
        System.out.println("animalMethod");
    }

}

public class Casting {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal = new Animal();

        Animal animalC = cat;
        // Cat catC = (Cat) Animal; 오류
        // Cat catC = (Cat) animal;

        animalC.animalMethod();
        // animalC.catMethod(); 
        // 자식 메소드 사용 불가

        // catC.animalMethod();
        // catC.catMethod();

        System.out.println("123");

        // 에러발생원인을 모르겠다.
    }
}
