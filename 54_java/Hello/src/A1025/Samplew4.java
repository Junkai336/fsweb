package A1025;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Samplew4 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("c:/Temp/out.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }

        pw.close();

    }
}
