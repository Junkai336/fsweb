package A1025;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sampler8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/Temp/out.txt"));

        while (true) {
            String line = br.readLine();
            if (line == null)
                break; // 더이상 읽을 라인이 없을 경우 while문을 빠져 나온다
            System.out.println(line);
        }
        br.close();
    }
}
