package A1017;

import java.util.Random;

public class Math1 {
    public static void main(String[] args) {
        
        System.out.println((int)(Math.random() * 100));

        // 

        Random ran = new Random();
        System.out.println(ran.nextInt(100));
    }
}

// Random은 Random이라는 유틸이 들어가야 쓸 수 있음
