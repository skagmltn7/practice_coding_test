package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.valueOf(st.nextToken());
        int A = Integer.valueOf(st.nextToken());
        int res = 0;
        while (S >= 2 && A >= 2) {
            S -= 2;
            A -= 2;
            res++;
        }
        System.out.println(res);
    }
}
