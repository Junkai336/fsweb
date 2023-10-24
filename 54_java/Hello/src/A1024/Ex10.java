package A1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// class Person {
//     public String name;
//     public int age;
//     public String gender;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public Person(String name, int age, String gender) {
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getGender() {
//         return gender;
//     }
// }

public class Ex10 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성"));

        long femaleCount = people.stream()
                .filter(person -> "여성".equals(person.getGender()))
                .count();

        // System.out.println(femaleCount);

        // 문제 나이가 25 이상인 사람을 필터링하여 새로운 리스트에 저장 후 출력
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() >= 25)
                .collect(Collectors.toList());

        for (Person person : filteredPeople) {
            System.out.println("name: " + person.getName() + "age: " + person.getAge());
        }

        filteredPeople.forEach(person -> {
            System.out.println("name : " + person.getName() + ", age" + person.getAge());
        });

    }
}
