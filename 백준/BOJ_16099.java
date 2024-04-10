import java.io.*;
import java.util.*;

public class BOJ_16099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long[] scores;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            scores = new long[2];
            for (int j = 0; j < 2; j++)
                scores[j] = (long) Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            if (scores[0] > scores[1]) {
                System.out.println("TelecomParisTech");
            } else if (scores[0] == scores[1]) {
                System.out.println("Tie");
            } else {
                System.out.println("Eurecom");
            }
        }
    }
}
