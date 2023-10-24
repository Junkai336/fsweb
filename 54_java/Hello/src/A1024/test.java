package A1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    public String name;
    public int age;
    public String sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}

public class test {
    public static void main(String[] args) {

        // 1
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        List<String> shortshort = strings.stream()
                .filter(asd -> asd.length() <= 3)
                .collect(Collectors.toList());

        System.out.println("문자열 길이 3 이하 = " + shortshort);

        // 2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4);

        List<Integer> repeatrepeat = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("중복 제거 = " + repeatrepeat);

        // 3
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));

        Integer youngyoung = people.stream()
                .map(Person::getAge)
                .min(Integer::compareTo)
                .orElse(0);

        // List<Person> youngman = people.stream();
                // .map(abc -> abc == youngyoung)
                // .collect(Collectors.toList());

        System.out.println("가장 어린 사람" + youngyoung);

        // 4
        List<String> strings2 = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        // 5
        List<Person> people2 = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성"));

    }
}

/*
 * 문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기
 * List<String> strings = Arrays.asList("apple", "banana", "cherry", "date",
 * "fig");
 * 
 * 문제 2: 숫자 목록에서 중복값 제거하기
 * List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
 * 
 * 문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기
 * List<Person> people = Arrays.asList(
 * new Person("Alice", 25),
 * new Person("Bob", 30),
 * new Person("Charlie", 22)
 * );
 * 
 * 
 * 문제 4: 문자열 목록에서 문자열 길이 평균 구하기
 * List<String> strings = Arrays.asList("apple", "banana", "cherry", "date",
 * "fig");
 * 
 * 
 * 문제 5: 사람 목록에서 특정 조건을 만족하는 사람 수 구하기
 * 
 * 성별이 여성인 사람수 구하기
 * List<Person> people = Arrays.asList(
 * new Person("Alice", 25, "여성"),
 * new Person("Bob", 30, "남성"),
 * new Person("Charlie"
 */