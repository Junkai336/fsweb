package A1005;

public class A1005_1 {
    public static void main(String[] args) {
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2;
        int[] arr3;

        arr1 = new int[] { 1, 2, 3 }; // 배열 { 1, 2, 3 } 을 생성하고 / arr1 변수에 대입
        arr2 = new int[] { 1, 2, 3 };
        arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입 // 번지를 넣는거기 때문에 같다~

        System.out.println(arr1);
        System.out.println(arr1.equals(arr2));
        System.out.println(arr2.equals(arr3));
        System.out.println();
        System.out.println(arr1 == arr2); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr2 == arr3);
        
    }
}

// new <- 이걸로 객체를 만들면 된다고 생각.