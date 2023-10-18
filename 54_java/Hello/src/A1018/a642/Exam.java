package A1018.a642;

import java.util.ArrayList;
import java.util.List;

class Board2 {
    public int number; 

    public Board2(int number) {
        this.number = number;
    }
}

public class Exam {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        System.out.println(list.size());

    }
}

/*
 * 문제 1: ArrayList에 요소 추가
 * ArrayList에 정수 요소 1부터 5까지를 추가하고 그 결과를 출력하세요.
 */
