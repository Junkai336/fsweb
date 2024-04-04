package A0925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A0925_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R1 = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int R2 = (S * 2) - R1;

        System.out.println(R2);

        // bw.write(String.valueOf(R2));

        // bw.flush();

        br.close();
        bw.close();
    }
}