package A1025;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Samplew5 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("c:/temp/out.txt");

        for (int i=1; i<11; i++) {
            String data = i + " 번째 줄입니다.a \r\n"; // 줄바꿈
            fw.write(data);
        }

        fw.close();

        FileWriter fw2 = new FileWriter("c:/temp/out.txt", true);

        for (int i=11; i<21; i++) {
            String data = i + " 번째 줄입니다.a \r\n"; // 줄바꿈
            fw2.write(data);
        }

        fw2.close();

    }
}
