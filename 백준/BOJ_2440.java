package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str;
        int N = Integer.valueOf(br.readLine());
        for (int i = N; i >= 0; i--) {
            str = new char[i];
            Arrays.fill(str, '*');
            System.out.println(str);
        }
    }
}
