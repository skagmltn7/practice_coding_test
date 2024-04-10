package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int m, f;
        while (true) {
            st = new StringTokenizer(br.readLine());
            m = Integer.valueOf(st.nextToken());
            f = Integer.valueOf(st.nextToken());
            if (m == 0 && f == 0) break;
            System.out.println(m + f);
        }
    }
}
