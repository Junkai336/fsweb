package A1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//사람 목록에서 특정 조건을 만족하는 사람 수 구하기(여성)
public class Ex10_2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성"));
        long femaleCount = people.stream()
                .filter(person -> "여성".equals(person.getGender()))
                .count();

        // 문제 나이가 25 이상인 사람을 필터링하여 새로운 리스트에 저장후 출력

        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() >= 25)
                .collect(Collectors.toList());

        for (Person person : filteredPeople) {
            System.out.println("name: " + person.getName() + ", age: " + person.getAge());
        }
        filteredPeople.forEach(person -> {
            System.out.println("name: " + person.getName() + ", age: " + person.getAge());
        });

    }
}