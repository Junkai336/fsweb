package A1010;

public class Animal {
    String name = "강아지";
    String breeds = "포메라니안";
    int age = 15;

    Animal() {}

    Animal(String name) {
        this.name = name;
    }

    Animal(String name, String breeds) {
        this.name = name;
        this.breeds = breeds;
    }

    Animal(String name, String breeds, int age) {
        this.name = name;
        this.breeds = breeds;
        this.age = age;
    }
}
