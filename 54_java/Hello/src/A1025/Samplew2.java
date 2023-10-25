package A1025;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Samplew2 {
    public static void main(String[] args) throws IOException {

        FileOutputStream output = new FileOutputStream("c:/temp/out.txt");

        for(int i = 0; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }

        output.close();

    }
}
