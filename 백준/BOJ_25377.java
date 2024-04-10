package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arrive = Integer.valueOf(st.nextToken());
            int left = Integer.valueOf(st.nextToken());

            if (arrive > left)
                continue;
            res = Integer.min(left, res);
        }
        System.out.println(res == Integer.MAX_VALUE ? -1 : res);
    }
}
