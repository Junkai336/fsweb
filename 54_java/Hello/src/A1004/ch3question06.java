package A1004;

public class ch3question06 {
    public static void main(String[] args) {
        
        for(int i=1; i<= 5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
                if(j==i) {
                    System.out.println();
                }
            }
        }

    }
}

/* 
 i1 j1
 i2 j1 j2
 i3 j1 j2 j3
 i4 j1 j2 j3 j4
 i5 j1 j2 j3 j4 j5

 i1 = j1 줄바꿈
 i2 = j2 줄바꿈
 i3 = j3 줄바꿈
 i4 = j4 줄바꿈
 i5 = j5 줄바꿈
 */
