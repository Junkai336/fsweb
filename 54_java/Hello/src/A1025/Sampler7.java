package A1025;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sampler7 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];

        FileInputStream input = new FileInputStream("c:/Temp/out.txt");

        input.read(b);

        System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력

        input.close();

    }
}
