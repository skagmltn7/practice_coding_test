package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int val = 0;
        int a, b;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            val += a * b;
        }

        if (total == val) System.out.println("Yes");
        else System.out.println("No");
    }
}
