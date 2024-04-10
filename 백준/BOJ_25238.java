package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25238 {
    public static int chk(int a, int b) {
        double percent =(double) a * (100 - b) * 0.01;
        if (percent >= 100) return 0;
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(chk(a, b));
    }
}