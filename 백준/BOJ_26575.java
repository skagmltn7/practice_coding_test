package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_26575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.valueOf(br.readLine());
        double answer;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            answer = 1.0;
            for (int j = 0; j < 3; j++) {
                answer *= Double.valueOf(st.nextToken());
            }
            System.out.printf("$%.2f\n", answer);
        }
    }
}
