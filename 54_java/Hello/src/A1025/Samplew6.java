package A1025;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Samplew6 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("c:/Temp/out.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }

        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/Temp/out.txt", true));

        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄입니다.";
            pw2.println(data);
        }

        pw2.close();

    }
}
