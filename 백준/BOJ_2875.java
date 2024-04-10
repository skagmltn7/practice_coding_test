import java.io.*;
import java.util.*;

public class BOJ_2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        int team = Integer.min(n / 2, m);
        n -= team*2;
        m -= team;
        int left = n + m - k;
        if (left < 0) {
            team = (3 * team + left) / 3;
        }
        System.out.println(team);
    }
}
