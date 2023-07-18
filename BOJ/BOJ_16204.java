package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        System.out.println(Integer.min(m, k) + Integer.min(n - m, n - k));
    }
}

