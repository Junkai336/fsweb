package A1024;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Ex08_2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));

        Person youngestPerson = null;
        for (Person person : people) {
            if (youngestPerson == null || person.getAge() < youngestPerson.getAge()) {
                youngestPerson = person;
            }
        }

        if (youngestPerson != null) {
            System.out.println("Youngest person: " + youngestPerson.getName());
        } else {
            System.out.println("No youngest person found");
        }
    }
}