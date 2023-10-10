package A1010;

public class AnimalExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("김", "말티즈");
        Animal myAnimal2 = new Animal("김");
        Animal myAnimal3 = new Animal();

        System.out.println("이름 : " + myAnimal.name);
        System.out.println("이름 : " + myAnimal.breeds);
        System.out.println("이름 : " + myAnimal2.breeds);
        System.out.println("이름 : " + myAnimal3.breeds);
        System.out.println("이름 : " + myAnimal3.name);
        System.out.println("이름 : " + myAnimal3.age);
    }
}
