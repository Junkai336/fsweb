package A1004;

public class A1004_11 {
    public static void main(String[] args) throws Exception {
        Outter: for(char upper='A'; upper<='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Outter;
                }
            }
        } 
    }
}

// 안쪽 for문에서부터 바깥쪽 for문까지 탈출하기 위해 라벨을 붙였다.