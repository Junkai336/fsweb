package A0925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // (A[0] - A[1]) + (A[1] - A[2]) + ... + (A[N-2] - A[N-1]) 의 최대값
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                
            }
        }
    }
}
