package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_17863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine());
        System.out.println(input / 10000 != 555 ? "NO" : "YES");

    }
}

