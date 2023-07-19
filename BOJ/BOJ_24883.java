package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input.equals("n") || input.equals("N")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}

