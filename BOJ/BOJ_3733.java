package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_3733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long n, s;
        while (true) {
            String cur = br.readLine();
            if (cur == null) break;
            st = new StringTokenizer(cur);
            n = Long.parseLong(st.nextToken());
            s = Long.parseLong(st.nextToken());
            System.out.println(s / (n + 1));
        }
    }
}
