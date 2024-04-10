package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] bucket = new int[2][2];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                bucket[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        System.out.println(Integer.min(bucket[0][0]+bucket[1][1], bucket[1][0]+bucket[0][1]));
    }
}
