package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] total = new int[2];
        int[] scores = {6, 3, 2, 1, 2};
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                total[i] += Integer.parseInt(st.nextToken()) * scores[j];
            }
        }
        System.out.printf("%d %d", total[0], total[1]);
    }
}
